package top.joylife.lemon.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import top.joylife.lemon.dao.AccountDao;
import top.joylife.lemon.dao.entity.Account;
import top.joylife.lemon.dao.mapper.AccountMapper;

@Repository
public class AccountDaoImpl implements AccountDao {

    @Autowired
    private AccountMapper accountMapper;


    /**
     * 添加
     *
     * @param account
     * @return
     */
    @Override
    public Integer add(Account account) {
        accountMapper.insertSelective(account);
        return account.getId();
    }

    /**
     * 更新
     *
     * @param account
     * @return
     */
    @Override
    public Integer update(Account account) {
        return accountMapper.updateByPrimaryKeySelective(account);
    }

    /**
     * 删除
     *
     * @param id
     */
    @Override
    public void delete(Integer id) {
        accountMapper.deleteByPrimaryKey(id);
    }

    /**
     * 获取
     *
     * @param id
     * @return
     */
    @Override
    public Account getById(Integer id) {
        return accountMapper.selectByPrimaryKey(id);
    }
}
