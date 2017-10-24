package top.joylife.lemon.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.joylife.lemon.common.bean.dto.AccountDto;
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


    @Override
    public void insert() {
        int a=3;
        testDao.insert(3,"小小小细节嘻嘻嘻");
        if(a==3){
            throw new RuntimeException();
        }
        testDao.insert(4,"XXXXXXXxczcz");
    }

}
