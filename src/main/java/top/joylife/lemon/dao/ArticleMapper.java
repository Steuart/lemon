package top.joylife.lemon.dao;

import top.joylife.lemon.controller.vo.ArticleInfoVo;
import top.joylife.lemon.domain.PageDto;
import top.joylife.lemon.entity.Article;

import java.util.List;

public interface ArticleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Article record);

    int insertSelective(Article record);

    Article selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKey(Article record);

    /**
     * 获取列表
     * @param pageDto
     * @return
     */
    List<Article> selectList(PageDto pageDto);

    /**
     * 获取热门文章列表
     * @return
     */
    List<Article> getHotArticles(Integer size);

    /**
     * 根据文章id获取文章信息
     * @param articleId
     * @return
     */
    ArticleInfoVo getArticleInfo(Integer articleId);
}