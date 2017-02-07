package top.joylife.lemon.dao;

import top.joylife.lemon.entity.Page;

public interface PageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Page record);

    int insertSelective(Page record);

    Page selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Page record);

    int updateByPrimaryKey(Page record);
}