package top.joylife.lemon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.joylife.lemon.common.bean.dto.ResultData;
import top.joylife.lemon.common.util.ReUtil;
import top.joylife.lemon.service.UserService;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Controller
public class IndexController {

    @Resource(name = "userService")
    private UserService userService;

    @RequestMapping("/")
    public String index(){

        return "index";
    }

    @RequestMapping("/user")
    @ResponseBody
    public ResultData tran(){
        Map<String,Object> data = new HashMap<>();
        data.put("xxx","xxxx");
        return ReUtil.success(data);
    }

    @RequestMapping("/hello")
    public String hello(Map<String,Object> data){
        data.put("name","守护天使");
        return "hello";
    }
}
