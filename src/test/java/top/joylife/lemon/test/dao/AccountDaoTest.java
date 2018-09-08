package top.joylife.lemon.test.dao;

import com.alibaba.fastjson.JSON;
import io.swagger.models.auth.In;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import top.joylife.lemon.dao.AccountDao;
import top.joylife.lemon.dao.entity.Account;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class AccountDaoTest {

    @Autowired
    private AccountDao accountDao;

    @Test
    @Transactional
    public void addTest(){
        Account account = new Account();
        account.setAccount("test");
        account.setPassword("1211221");
        account.setType("1221");
        account.setUserId(12);
        accountDao.add(account);
        Assert.assertNotNull(account.getId());
    }

    @Test
    public void getTest(){
        Account account = accountDao.getById(1);
        Assert.assertEquals("test",account.getAccount());
        Assert.assertEquals("1211221",account.getPassword());
        Assert.assertEquals("1221",account.getType());
        Assert.assertEquals(Integer.valueOf(12),account.getUserId());

    }
}
