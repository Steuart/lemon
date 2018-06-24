package top.joylife.lemon.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import top.joylife.lemon.common.bean.dto.ArticleDto;
import top.joylife.lemon.dao.ArticleDao;
import top.joylife.lemon.dao.ClassifyDao;
import top.joylife.lemon.dao.TagDao;
import top.joylife.lemon.dao.entity.Article;
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
        List<Tag> tags = tagDao.listByName(names);
        Map<String,Tag> tagMap = new HashMap<>();
        if(!CollectionUtils.isEmpty(tags)){
            tags.forEach(tag -> {
                tagMap.put(tag.getName(),tag);
            });
        }
        List<Tag> addTags = new ArrayList<>();


        return null;
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
