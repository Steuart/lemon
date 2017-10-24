package top.joylife.lemon.service;

import top.joylife.lemon.common.bean.dto.AccountDto;

import java.util.List;

public interface TestService {

    List<AccountDto> getData();

    void insert();
}
