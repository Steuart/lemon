package top.joylife.lemon.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import top.joylife.lemon.common.cache.RedisCache;
import top.joylife.lemon.common.consts.ReData;
import top.joylife.lemon.common.util.ReUtil;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;


/**
 * Created by HemingWu on 2016/10/22.
 */
@Controller
@RequestMapping("/")
public class SystemController {

    private Logger logger = LoggerFactory.getLogger(SystemController.class);


    @RequestMapping("")
    public String index(ModelMap model, HttpServletRequest request){
        model.put("msg","welcome");
        WebApplicationContext context = (WebApplicationContext) request.getAttribute(DispatcherServlet.WEB_APPLICATION_CONTEXT_ATTRIBUTE);
        SystemController systemController = (SystemController) context.getBean("systemController");
        ReData reData = systemController.indexJson();
        return "index";
    }

    @RequestMapping("article")
    public String article(ModelMap model){
        model.put("msg","welcome");

        return "article";
    }

    @RequestMapping("json")
    @ResponseBody
    public ReData indexJson(){
        return ReUtil.success();
    }

    @RequestMapping("login")
    public String home(ModelMap model){
        logger.error("dsaadasd__________________________");


        model.put("aaa",new java.sql.Timestamp(new Date().getTime()));


        return "login";
    }


    @RequestMapping("websocketpage")
    public String webSocket(){
        return "websocket";
    }

    @RequestMapping("register")
    public String register(){
        return "register";
    }

    @RequestMapping("findback")
    public String findback(){
        return "findback";
    }

    @RequestMapping("updatepwd")
    public String updatepwd(){
        return "updatepwd";
    }

    @RequestMapping("tags")
    public String tags(){
        return "tags";
    }
}
