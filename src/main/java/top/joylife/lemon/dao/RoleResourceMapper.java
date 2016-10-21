package top.joylife.lemon.dao;

import top.joylife.lemon.entity.roleResource;

public interface RoleResourceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(roleResource record);

    int insertSelective(roleResource record);

    roleResource selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(roleResource record);

    int updateByPrimaryKey(roleResource record);
}