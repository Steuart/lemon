package top.joylife.lemon.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.joylife.lemon.common.consts.ReData;
import top.joylife.lemon.common.util.ReUtil;
import top.joylife.lemon.domain.UserDto;
import top.joylife.lemon.service.UserService;

import javax.annotation.Resource;

/**
 * Created by HemingWu on 2017/2/7.
 */
@Controller
@RequestMapping("admin/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("add")
    @ResponseBody
    private ReData addUser(UserDto userDto){
        userService.add(userDto);
        return ReUtil.success();
    }

}
