package top.joylife.lemon.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.joylife.lemon.common.consts.ReData;
import top.joylife.lemon.common.util.ReUtil;
import top.joylife.lemon.domain.StatusDto;
import top.joylife.lemon.domain.UserAccountDto;
import top.joylife.lemon.entity.User;
import top.joylife.lemon.service.AccountService;
import top.joylife.lemon.service.UserService;

import javax.annotation.Resource;

/**
 * Created by HemingWu on 2017/2/7.
 */
@Controller("adminUserController")
@RequestMapping("admin/user")
public class UserController {

    @Resource
    private UserService userService;

    @Resource
    private AccountService accountService;

    /**
     * 后台管理员添加用户
     * @param userAccountDto
     * @return
     */
    @RequestMapping("addUser")
    @ResponseBody
    public ReData addUser(@RequestBody UserAccountDto userAccountDto){
        int userId = userService.addUser(userAccountDto);
        return ReUtil.success(userId);
    }

    /**
     * 更新用户账户状态
     * @param statusDto
     * @return
     */
    @RequestMapping("updateAccStatus")
    @ResponseBody
    public ReData logicRemove(@RequestBody StatusDto statusDto){
        byte statusCode = statusDto.getStatusCode();
        int userId = statusDto.getId();
        accountService.updateStatus(statusCode,userId);
        return ReUtil.success();
    }

    /**
     * 更新用户信息
     * @param user
     * @return
     */
    public ReData updateUser(@RequestBody User user) {
        userService.updateUser(user);
        return ReUtil.success();
    }
}
