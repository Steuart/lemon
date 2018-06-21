package top.joylife.lemon.dao;

import top.joylife.lemon.dao.entity.User;

/**
 * created by wuhaiming on 2018/6/20
 */
public interface UserDao {

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    User getById(Integer id);
}
