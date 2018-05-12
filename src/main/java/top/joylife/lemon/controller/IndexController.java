package top.joylife.lemon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.joylife.lemon.common.bean.dto.ResultData;
import top.joylife.lemon.common.util.ResultUtil;
import top.joylife.lemon.dao.entity.User;
import top.joylife.lemon.service.UserService;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class Index {

    @Resource(name = "userService")
    private UserService userService;

    @RequestMapping("/")
    public ResultData index(){

        return ResultUtil.success("");
    }

    @RequestMapping("/user")
    public ResultData tran(){
        List<User> userList =  userService.getUser();
        return ResultUtil.success(userList);
    }

    @RequestMapping("/hello")
    public String hello(Map<String,Object> data){
        data.put("name","守护天使");
        return "hello";
    }
}
