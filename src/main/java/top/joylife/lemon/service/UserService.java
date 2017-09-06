package top.joylife.lemon.service;

import top.joylife.lemon.common.bean.domain.UserAccountDto;
import top.joylife.lemon.entity.User;

/**
 * Created by HemingWu on 2017/2/7.
 */
public interface UserService {


    /**
     * 添加用户
     * @param userDto
     * @return
     */
    int addUser(UserAccountDto userDto);



    /**
     * 更新用户信息
     * @param user
     * @return
     */
    int updateUser(User user);

}
