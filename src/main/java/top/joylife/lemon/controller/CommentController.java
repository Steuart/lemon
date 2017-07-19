package top.joylife.lemon.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.joylife.lemon.common.consts.ReData;
import top.joylife.lemon.common.util.ReUtil;
import top.joylife.lemon.controller.vo.CommentVo;
import top.joylife.lemon.domain.PageDto;
import top.joylife.lemon.service.CommentService;

import javax.annotation.Resource;

/**
 * Created by WuHaiming on 2017/7/19 0019.
 */

@Controller
@RequestMapping("comment")
public class CommentController {

    @Resource
    private CommentService commentService;


    @ResponseBody
    @RequestMapping("list")
    public ReData getList(PageDto pageDto){
        PageInfo<CommentVo> comments =  commentService.getCommentPage(pageDto);
        return ReUtil.success(comments);
    }

}
