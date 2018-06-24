package top.joylife.lemon.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import top.joylife.lemon.common.bean.dto.ArticleDto;
import top.joylife.lemon.dao.ArticleDao;
import top.joylife.lemon.dao.ArticleTagDao;
import top.joylife.lemon.dao.ClassifyDao;
import top.joylife.lemon.dao.TagDao;
import top.joylife.lemon.dao.entity.Article;
import top.joylife.lemon.dao.entity.ArticleTag;
import top.joylife.lemon.dao.entity.Tag;
import top.joylife.lemon.service.ArticleService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * created by wuhaiming on 2018/2/9
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleDao articleDao;

    @Autowired
    private TagDao tagDao;

    @Autowired
    private ArticleTagDao articleTagDao;

    @Autowired
    private ClassifyDao classifyDao;

    /**
     * 保存文章
     *
     * @param articleDto
     * @return
     */
    @Override
    @Transactional
    public Integer add(ArticleDto articleDto) {
        //保存文章
        Article article = buildArticle(articleDto);
        articleDao.save(article);

        //保存标签
        List<String> names = articleDto.getTags();
        saveTag(names);

        //保存文章标签关系
        saveArticleTag(names,article.getId());
        return articleDto.getId();
    }

    /**
     * 更新文章
     *
     * @param articleDto
     * @return
     */
    @Override
    public Integer update(ArticleDto articleDto) {//保存文章
        Article article = buildArticle(articleDto);
        articleDao.update(article);

        //保存标签
        List<String> names = articleDto.getTags();
        saveTag(names);

        //删除旧的标签文章关系
        articleTagDao.deleteByArticleId(articleDto.getId());
        //保存文章标签关系
        saveArticleTag(names,article.getId());
        return articleDto.getId();
    }

    /**
     * 根据id查询文章
     *
     * @param id
     * @return
     */
    @Override
    public ArticleDto getById(Integer id) {
        ArticleDto articleDto = new ArticleDto();
        //获取文章信息
        Article article = articleDao.get(id);
        articleDto.setId(article.getId());
        articleDto.setMarkdown(article.getMarkdown());
        articleDto.setAuthId(article.getAuthorId());
        articleDto.setAuthName(article.getAuthorName());
        articleDto.setHtml(article.getHtml());
        articleDto.setClassifyId(article.getClassifyId());
        articleDto.setCoverImg(article.getCoverImg());
        articleDto.setSummary(article.getSummary());
        articleDto.setTitle(article.getTitle());

        //获取标签信息
        List<ArticleTag> articleTags = articleTagDao.listByArticleId(article.getId());
        if(!CollectionUtils.isEmpty(articleTags)){
            List<String> tagNames = new ArrayList<>();
            articleTags.forEach(articleTag -> {
                tagNames.add(articleTag.getTagName());
            });
            articleDto.setTags(tagNames);
        }

        return articleDto;
    }

    /**
     * 构建文章信息
     * @param articleDto
     * @return
     */
    private Article buildArticle(ArticleDto articleDto){
        Article article = new Article();
        article.setAuthorName(articleDto.getAuthName());
        article.setAuthorId(articleDto.getAuthId());
        article.setClassifyId(articleDto.getClassifyId());
        article.setCoverImg(articleDto.getCoverImg());
        article.setHtml(articleDto.getHtml());
        article.setMarkdown(articleDto.getMarkdown());
        article.setSummary(articleDto.getSummary());
        article.setTitle(article.getTitle());
        article.setId(articleDto.getId());
        return article;
    }

    /**
     * 保存标签
     * @param names
     * @return
     */
    private void saveTag(List<String> names){
        Map<String,Tag> tagMap = new HashMap<>();
        if(!CollectionUtils.isEmpty(names)){
            List<Tag> tags = tagDao.listByName(names);
            if(!CollectionUtils.isEmpty(tags)){
                tags.forEach(tag -> {
                    tagMap.put(tag.getName(),tag);
                });
            }
            List<Tag> addTags = new ArrayList<>();
            names.forEach(name->{
                Tag exist = tagMap.get(name);
                if(exist==null){
                    Tag tag = new Tag();
                    tag.setArticleNumber(0);
                    tag.setName(name);
                    addTags.add(tag);
                }
            });
            tagDao.batchAdd(tags);
        }
    }

    /**
     * 保存文章标签关系
     * @param names
     */
    private void saveArticleTag(List<String> names,Integer articleId){
        //保存标签文章关系
        if(!CollectionUtils.isEmpty(names)){
            List<ArticleTag> articleTags = new ArrayList<>();
            names.forEach(name ->{
                ArticleTag articleTag = new ArticleTag();
                articleTag.setArticleId(articleId);
                articleTag.setTagName(name);
                articleTags.add(articleTag);
            });
            articleTagDao.batchAdd(articleTags);
        }
    }
}
