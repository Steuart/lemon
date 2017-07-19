package top.joylife.lemon.dao;

import top.joylife.lemon.controller.vo.CommentVo;
import top.joylife.lemon.entity.Comment;

import java.util.List;

public interface CommentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Comment record);

    int insertSelective(Comment record);

    Comment selectByPrimaryKey(Integer id);

    /**
     * 获取评论列表
     * @param articleId
     * @return
     */
    List<CommentVo> getComments(Integer articleId);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);
}