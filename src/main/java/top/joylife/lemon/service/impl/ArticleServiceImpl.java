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
import java.util.Collections;
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
        Article article = new Article();
        article.setAuthorName(articleDto.getAuthName());
        article.setAuthorId(articleDto.getAuthId());
        article.setClassifyId(articleDto.getClassifyId());
        article.setCoverImg(articleDto.getCoverImg());
        article.setHtml(articleDto.getHtml());
        article.setMarkdown(articleDto.getMarkdown());
        article.setSummary(articleDto.getSummary());
        article.setTitle(article.getTitle());
        articleDao.save(article);
        Integer articleId = article.getId();
        //保存标签
        List<String> names = articleDto.getTags();
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
            List<Tag> saveTag = tagDao.batchAdd(tags);
            saveTag.forEach(tag->{
                tagMap.put(tag.getName(),tag);
            });
        }
        //删除旧的标签文章关系
        articleTagDao.deleteByArticleId(articleId);
        //保存标签文章关系
        if(!CollectionUtils.isEmpty(names)){
            List<ArticleTag> articleTags = new ArrayList<>();
            tagMap.forEach((name,key)->{
                ArticleTag articleTag = new ArticleTag();
                articleTag.setArticleId(articleId);
                articleTag.setTagId(key.getId());
                articleTags.add(articleTag);
            });
            articleTagDao.batchAdd(articleTags);
        }
        return articleId;
    }

    /**
     * 根据id查询文章
     *
     * @param id
     * @return
     */
    @Override
    public ArticleDto getById(Integer id) {
        return null;
    }
}
