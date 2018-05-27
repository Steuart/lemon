package top.joylife.lemon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * created by wuhaiming on 2018/5/26
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @RequestMapping("")
    public String home(Map<String,Object> data){
        return "index";
    }

    @RequestMapping("/overview")
    public String overview(Map<String,Object> data){
        data.put("title","总览");
        data.put("overview","focus");
        return "overview";
    }

    @RequestMapping("/user")
    public String user(Map<String,Object> data){
        data.put("title","总览");
        data.put("user","focus");
        return "overview";
    }

    @RequestMapping("/comment")
    public String comment(Map<String,Object> data){
        data.put("title","总览");
        data.put("comment","focus");
        return "comment";
    }

    @RequestMapping("/article")
    public String article(Map<String,Object> data){
        data.put("title","总览");
        data.put("article","focus");
        return "article";
    }

    @RequestMapping("/tags")
    public String tags(Map<String,Object> data){
        data.put("title","总览");
        data.put("tags","focus");
        return "tags";
    }

    @RequestMapping("/system")
    public String system(Map<String,Object> data){
        data.put("title","总览");
        data.put("system","focus");
        return "system";
    }
}
