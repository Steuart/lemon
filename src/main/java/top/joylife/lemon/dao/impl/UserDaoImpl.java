package top.joylife.lemon.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import top.joylife.lemon.dao.UserDao;
import top.joylife.lemon.dao.entity.User;
import top.joylife.lemon.dao.mapper.UserMapper;

/**
 * created by wuhaiming on 2018/6/20
 */

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private UserMapper userMapper;

    /**
     * 根据id查询用户
     *
     * @param id
     * @return
     */
    @Override
    public User getById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
