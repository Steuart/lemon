package top.joylife.lemon.dao.impl;

import org.jooq.DSLContext;
import org.jooq.impl.DefaultDSLContext;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Repository;
import top.joylife.lemon.common.bean.dto.AccountDto;
import top.joylife.lemon.dao.TestDao;
import top.joylife.lemon.jooq.tables.records.TAccountRecord;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

import static top.joylife.lemon.jooq.Tables.T_ACCOUNT;
import static top.joylife.lemon.jooq.Tables.T_USER;

@Repository(value = "testDao")
public class TestDaoImpl implements TestDao {

    @Resource
    DefaultDSLContext create;

    @Override
    public List<AccountDto> getTaccount() {
        List<TAccountRecord> records = create.selectFrom(T_ACCOUNT).orderBy(T_ACCOUNT.ID.asc()).fetch();
        List<AccountDto> accountDtos = new ArrayList<>();
        records.forEach(record->{
            AccountDto accountDto = new AccountDto();
            BeanUtils.copyProperties(record,accountDto);
            accountDtos.add(accountDto);
        });

        return accountDtos;
    }

    @Override
    public void insert(int userid,String name) {
        create.update(T_USER).set(T_USER.NICKNAME,name).where(T_USER.ID.eq(userid)).execute();
    }
}
