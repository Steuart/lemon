package top.joylife.lemon.dao;

import top.joylife.lemon.entity.ArticleContent;

public interface ArticleContentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ArticleContent record);

    int insertSelective(ArticleContent record);

    ArticleContent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ArticleContent record);

    int updateByPrimaryKey(ArticleContent record);
}