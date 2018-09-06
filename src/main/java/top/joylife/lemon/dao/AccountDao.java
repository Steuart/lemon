package top.joylife.lemon.dao;

import top.joylife.lemon.dao.entity.Account;

public interface AccountDao {

    /**
     * 添加
     * @param account
     * @return
     */
    Integer add(Account account);

    /**
     * 更新
     * @param account
     * @return
     */
    Integer update(Account account);

    /**
     * 删除
     * @param id
     */
    void delete(Integer id);

    /**
     * 获取
     * @param id
     * @return
     */
    Account getById(Integer id);
}
