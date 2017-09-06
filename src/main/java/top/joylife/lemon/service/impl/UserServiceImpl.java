package top.joylife.lemon.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.joylife.lemon.dao.AccountMapper;
import top.joylife.lemon.dao.UserMapper;
import top.joylife.lemon.dao.UserRoleMapper;
import top.joylife.lemon.common.bean.domain.UserAccountDto;
import top.joylife.lemon.entity.Account;
import top.joylife.lemon.entity.User;
import top.joylife.lemon.entity.UserRole;
import top.joylife.lemon.service.UserService;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by HemingWu on 2017/2/7.
 */
@Service
public class UserServiceImpl implements UserService{

    @Resource
    private UserMapper userMapper;

    @Resource
    private AccountMapper accountMapper;

    @Resource
    private UserRoleMapper userRoleMapper;

    /**
     * 增加
     * @param entity
     * @return
     */
    @Override
    @Transactional
    public int addUser(UserAccountDto entity) {
        User user = entity.getUser();
        user.setCreateTime(new Date());
        userMapper.insertSelective(user);
        Account account = entity.getAccount();
        account.setCreateTime(new Date());
        account.setUserId(user.getId());
        accountMapper.insertSelective(account);
        Integer[] roleIds = entity.getRoleIds();
        if(roleIds!=null && roleIds.length!=0) {
            for(Integer roleId:roleIds){
                UserRole userRole = new UserRole();
                userRole.setUserId(user.getId());
                userRole.setRoleId(roleId);
                userRoleMapper.insertSelective(userRole);
            }
        }
        return user.getId();
    }


    /**
     * 更新用户信息
     *
     * @param user
     * @return
     */
    @Override
    public int updateUser(User user) {
        return userMapper.updateByPrimaryKeySelective(user);
    }

}
