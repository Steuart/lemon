package top.joylife.lemon.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.joylife.lemon.dao.*;
import top.joylife.lemon.entity.Account;
import top.joylife.lemon.service.AccountService;

import java.util.List;

/**
 * Created by WuHaiming on 2016/10/21.
 */
@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountMapper accountMapper;

    @Autowired
    private RolesMapper rolesMapper;

    @Autowired
    private ResourcesMapper resourcesMapper;

    /**
     * 通过身份标识获取账户
     *
     * @return
     */
    @Override
    public Account getAccountByIdentifier(String identifier) {
        return accountMapper.selectByIdentifier(identifier);
    }

    /**
     * 通过用户id获取用户角色
     *
     * @param userId
     * @return
     */
    @Override
    public List<String> getRoleNameByUserId(Integer userId) {

        return rolesMapper.selectRoleNameByUserId(userId);
    }

    /**
     * 通过用户角色获取用户资源
     *
     * @param userId
     * @return
     */
    @Override
    public List<String> getResourceByUserId(Integer userId) {

        return resourcesMapper.selectResourceByUserId(userId);
    }

}
