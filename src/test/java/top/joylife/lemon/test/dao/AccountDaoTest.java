package top.joylife.lemon.test.dao;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.joylife.lemon.dao.AccountDao;
import top.joylife.lemon.dao.entity.Account;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class AccountDaoTest {

    @Autowired
    private AccountDao accountDao;

    @Test
    public void addTest(){
        Account account = new Account();
        account.setAccount("test");
        account.setPassword("1211221");
        account.setType("1221");
        account.setUserId(12);
        accountDao.add(account);
        log.info("account:{}", JSON.toJSONString(account));
    }

    @Test
    public void getTest(){
        Account account = accountDao.getById(1);
        log.info("account:{}",JSON.toJSONString(account));
    }
}
