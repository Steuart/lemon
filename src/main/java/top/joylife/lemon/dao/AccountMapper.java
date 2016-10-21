package top.joylife.lemon.dao;

import org.apache.ibatis.annotations.Mapper;
import top.joylife.lemon.entity.Account;

public interface AccountMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Account record);

    int insertSelective(Account record);

    Account selectByPrimaryKey(Integer id);

    Account selectByIdentifier(String identifier);

    int updateByPrimaryKeySelective(Account record);

    int updateByPrimaryKey(Account record);
}