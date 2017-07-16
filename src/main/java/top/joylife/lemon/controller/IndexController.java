package top.joylife.lemon.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import top.joylife.lemon.controller.vo.ArticleVo;
import top.joylife.lemon.domain.PageDto;
import top.joylife.lemon.service.ArticleService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by WuHaiming on 2017/7/15 0015.
 */

@Controller
public class IndexController {

    @Resource
    private ArticleService articleService;


    @RequestMapping("/")
    public String index(Model model){
        PageDto pageDto = new PageDto();
        PageInfo<ArticleVo> pageInfo =  articleService.pageList(pageDto);
        model.addAttribute("pageInfo",pageInfo);
        return "index";
    }
}
