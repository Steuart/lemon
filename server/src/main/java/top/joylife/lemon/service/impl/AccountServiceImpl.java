package top.joylife.lemon.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.joylife.lemon.dao.AccountMapper;
import top.joylife.lemon.dao.ResourceMapper;
import top.joylife.lemon.dao.RoleMapper;
import top.joylife.lemon.domain.PageDto;
import top.joylife.lemon.domain.StatusDto;
import top.joylife.lemon.entity.Account;
import top.joylife.lemon.service.AccountService;

import java.util.List;

/**
 * Created by WuHaiming on 2016/10/21.
 */
@Service
public class AccountServiceImpl implements AccountService {

    private Logger log = LoggerFactory.getLogger(AccountServiceImpl.class);

    @Autowired
    private AccountMapper accountMapper;

    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private ResourceMapper resourceMapper;

    /**
     * 通过身份标识获取账户
     *
     * @return
     */
    @Override
    public Account getAccountByIdentifier(String identifier) {
        return null;
    }

    /**
     * 通过用户id获取用户角色
     *
     * @param userId
     * @return
     */
    @Override
    public List<String> getRoleNameByUserId(Integer userId) {

        return null;
    }

    /**
     * 通过用户角色获取用户资源
     *
     * @param userId
     * @return
     */
    @Override
    public List<String> getResourceByUserId(int userId) {
        return null;
    }

    /**
     * 更新用户的账户状态
     *
     * @param statusCode
     * @param userId
     * @return
     */
    @Override
    public int updateStatus(byte statusCode, int userId) {
        Account account = new Account();
        account.setUserId(userId);
        account.setStatus(statusCode);
        return accountMapper.updateStatusByUserId(account);
    }


}
