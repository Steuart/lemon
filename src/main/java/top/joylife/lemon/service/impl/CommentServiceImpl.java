package top.joylife.lemon.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import top.joylife.lemon.common.bean.vo.CommentVo;
import top.joylife.lemon.dao.CommentMapper;
import top.joylife.lemon.common.bean.domain.PageDto;
import top.joylife.lemon.entity.Comment;
import top.joylife.lemon.entity.Replay;
import top.joylife.lemon.service.CommentService;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by HemingWu on 2017/2/7.
 */


@Service
public class CommentServiceImpl implements CommentService{

    @Resource
    private CommentMapper commentMapper;

    /**
     * 添加评论
     *
     * @param comment
     * @return
     */
    @Override
    public int addComment(Comment comment) {
        return 0;
    }

    /**
     * 更新评论
     *
     * @param comment
     * @return
     */
    @Override
    public int updateComment(Comment comment) {
        return 0;
    }

    /**
     * 更新评论状态
     *
     * @param commentId
     * @param statusCode
     * @return
     */
    @Override
    public int updateStatus(int commentId, byte statusCode) {
        return 0;
    }

    /**
     * 获取评论分页列表
     *
     * @param pageDto
     * @return
     */
    @Override
    public PageInfo<CommentVo> getCommentPage(PageDto pageDto) {

        Integer articleId = Integer.valueOf(pageDto.getSearchParam());
        int pageNo = pageDto.getPageNo();
        int pageSize = pageDto.getPageSize();
        PageHelper.startPage(pageNo,pageSize);
        List<CommentVo> commentVos = commentMapper.getComments(articleId);
        PageInfo<CommentVo> pageInfo = new PageInfo<>(commentVos);
        return pageInfo;
    }

    /**
     * 回复评论
     *
     * @param replay
     * @return
     */
    @Override
    public int addReplay(Replay replay) {
        return 0;
    }

    /**
     * 更新回复
     *
     * @param replay
     * @return
     */
    @Override
    public int updateReplay(Replay replay) {
        return 0;
    }

    /**
     * 更新回复状态
     *
     * @param replayId
     * @param statusCode
     * @return
     */
    @Override
    public int updateReplayStatus(int replayId, byte statusCode) {
        return 0;
    }
}
