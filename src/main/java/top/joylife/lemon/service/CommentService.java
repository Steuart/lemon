package top.joylife.lemon.service;

import com.github.pagehelper.PageInfo;
import top.joylife.lemon.controller.vo.CommentVo;
import top.joylife.lemon.domain.PageDto;
import top.joylife.lemon.entity.Comment;
import top.joylife.lemon.entity.Replay;

/**
 * Created by HemingWu on 2017/2/7.
 */
public interface CommentService {

    /**
     * 添加评论
     * @param comment
     * @return
     */
    int addComment(Comment comment);

    /**
     * 更新评论
     * @param comment
     * @return
     */
    int updateComment(Comment comment);

    /**
     * 更新评论状态
     * @param commentId
     * @param statusCode
     * @return
     */
    int updateStatus(int commentId,byte statusCode);

    /**
     * 获取评论分页列表
     * @param pageDto
     * @return
     */
    PageInfo<CommentVo> getCommentPage(PageDto pageDto);

    /**
     * 回复评论
     * @param replay
     * @return
     */
    int addReplay(Replay replay);

    /**
     * 更新回复
     * @return
     */
    int updateReplay(Replay replay);

    /**
     * 更新回复状态
     * @param replayId
     * @param statusCode
     * @return
     */
    int updateReplayStatus(int replayId,byte statusCode);
}
