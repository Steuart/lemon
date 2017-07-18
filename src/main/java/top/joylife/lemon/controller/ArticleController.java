package top.joylife.lemon.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import top.joylife.lemon.controller.vo.ArticleInfoVo;
import top.joylife.lemon.controller.vo.ArticleVo;
import top.joylife.lemon.domain.PageDto;
import top.joylife.lemon.service.ArticleService;

import javax.annotation.Resource;

/**
 * Created by WuHaiming on 2017/7/16 0016.
 */
@Controller
@RequestMapping("/article")
public class ArticleController {

    @Resource
    private ArticleService articleService;

    @RequestMapping("/list")
    public String articles(Model model){
        PageDto pageDto = new PageDto();
        PageInfo<ArticleVo> pageInfo =  articleService.pageList(pageDto);
        model.addAttribute("pageInfo",pageInfo);
        return "/article/list";
    }

    @RequestMapping("/{articleId}")
    public String article(@PathVariable Integer articleId, Model model){
        ArticleInfoVo articleInfoVo=articleService.getArticleInfo(articleId);
        model.addAttribute("article",articleInfoVo);
        return "/article/article";
    }
}
