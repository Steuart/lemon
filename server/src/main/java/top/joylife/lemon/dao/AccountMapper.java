package top.joylife.lemon.dao;

import top.joylife.lemon.entity.Account;

public interface AccountMapper {

    /**
     * 更改账户状态
     * @param record
     * @return
     */
    int updateStatusByUserId(Account record);

    /**
     * 通过用户id删除账户
     * @param userId
     * @return
     */
    int deleteByUserId(Integer userId);


    int deleteByPrimaryKey(Integer id);

    int insert(Account record);

    int insertSelective(Account record);

    Account selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Account record);

    int updateByPrimaryKey(Account record);
}