package top.joylife.lemon.dao;

import top.joylife.lemon.entity.Roles;

import java.util.List;

public interface RolesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Roles record);

    int insertSelective(Roles record);

    Roles selectByPrimaryKey(Integer id);

    List<String> selectRoleNameByUserId(Integer userId);

    int updateByPrimaryKeySelective(Roles record);

    int updateByPrimaryKey(Roles record);
}