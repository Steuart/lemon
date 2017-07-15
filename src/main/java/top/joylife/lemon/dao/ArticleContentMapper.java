package top.joylife.lemon.dao;

import top.joylife.lemon.entity.ArticleContent;
import top.joylife.lemon.entity.ArticleContentWithBLOBs;

public interface ArticleContentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ArticleContentWithBLOBs record);

    int insertSelective(ArticleContentWithBLOBs record);

    ArticleContentWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ArticleContentWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ArticleContentWithBLOBs record);

    int updateByPrimaryKey(ArticleContent record);
}