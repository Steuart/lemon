package top.joylife.lemon.service.impl;

import org.springframework.stereotype.Service;
import top.joylife.lemon.bean.dto.AccountDto;
import top.joylife.lemon.dao.TestDao;
import top.joylife.lemon.service.TestService;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "testService")
public class TestServiceImpl implements TestService{
    @Resource(name = "testDao")
    private TestDao testDao;

    @Override
    public List<AccountDto> getData() {
        return testDao.getTaccount();
    }
}
