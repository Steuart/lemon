package top.joylife.lemon.dao;


import top.joylife.lemon.common.bean.dto.AccountDto;

import java.util.List;

public interface TestDao {
    List<AccountDto> getTaccount();

    void insert(int userid,String name);
}
