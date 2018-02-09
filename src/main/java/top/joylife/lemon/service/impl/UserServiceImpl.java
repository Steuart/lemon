package top.joylife.lemon.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.joylife.lemon.dao.entity.User;
import top.joylife.lemon.dao.mapper.UserMapper;
import top.joylife.lemon.service.UserService;

import java.util.List;

/**
 * created by wuhaiming on 2018/2/9
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUser() {
        return userMapper.selectAll();
    }
}
