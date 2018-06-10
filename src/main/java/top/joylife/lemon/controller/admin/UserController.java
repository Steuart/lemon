package top.joylife.lemon.controller.admin;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import top.joylife.lemon.common.bean.dto.ResultData;
import top.joylife.lemon.common.util.ReUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * created by wuhaiming on 2018/6/10
 */
@RestController(value = "adminUserController")
@RequestMapping(value = "/admin/user")
@Slf4j
public class UserController {

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public ResultData<Map<String,Object>> login(@RequestBody Map<String,Object> param){
        Map<String,Object> data = new HashMap<>();
        log.info(JSON.toJSONString(param));
        data.put("token","1221");
        return ReUtil.success(data);
    }

    @RequestMapping(value = "info",method = RequestMethod.GET)
    public ResultData<Map<String,Object>> info(String token){
        Map<String,Object> data = new HashMap<>();
        List<String> roles = new ArrayList<>();
        roles.add("admin");
        data.put("roles",roles);
        data.put("name","admin");
        data.put("avatar","https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
        return ReUtil.success(data);
    }

    @RequestMapping(value = "logout",method = RequestMethod.POST)
    public ResultData<Map> logout(String token){
        Map<String,Object> data = new HashMap<>();
        return ReUtil.success(data);
    }
}
