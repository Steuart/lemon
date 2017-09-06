package top.joylife.lemon.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import top.joylife.lemon.common.bean.vo.ArticleVo;
import top.joylife.lemon.common.bean.domain.PageDto;
import top.joylife.lemon.entity.Article;
import top.joylife.lemon.entity.Link;
import top.joylife.lemon.entity.Tag;
import top.joylife.lemon.service.ArticleService;
import top.joylife.lemon.service.LinkService;
import top.joylife.lemon.service.TagService;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by WuHaiming on 2017/7/15 0015.
 */

@Controller
public class IndexController {

    @Resource
    private ArticleService articleService;

    @Resource
    private TagService tagService;

    @Resource
    private LinkService linkService;

    @RequestMapping("/")
    public String index(Model model,PageDto pageDto){

        PageInfo<ArticleVo> pageInfo =  articleService.pageList(pageDto);
        List<Article> articles = articleService.getHotArticles();
        List<Tag> tags = tagService.getHotTags(null);
        List<Link> links = linkService.getLinkList();
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("hotArticles",articles);
        model.addAttribute("hotTags",tags);
        model.addAttribute("links",links);
        return "index";
    }
}
