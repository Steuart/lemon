package top.joylife.lemon.dao;

import top.joylife.lemon.controller.vo.ArticleVo;
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
    List<ArticleVo> selectList(PageDto pageDto);
}