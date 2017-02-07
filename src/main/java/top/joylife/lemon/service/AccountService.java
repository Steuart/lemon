package top.joylife.lemon.service;

import top.joylife.lemon.domain.StatusDto;
import top.joylife.lemon.entity.Account;

import java.util.List;

/**
 * Created by WuHaiming on 2016/10/21.
 */
public interface AccountService {

    /**
     * 通过身份标识获取账户
     * @return
     */
    Account getAccountByIdentifier(String identifier);

    /**
     * 通过用户id获取用户角色
     * @param userId
     * @return
     */
    List<String> getRoleNameByUserId(Integer userId);

    /**
     * 通过用户角色获取用户资源
     * @param userId
     * @return
     */
    List<String> getResourceByUserId(int userId);

    /**
     * 更新用户的账户状态
     * @param statusCode
     * @param userId
     * @return
     */
    int updateStatus(byte statusCode,int userId);
}
