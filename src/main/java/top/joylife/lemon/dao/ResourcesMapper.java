package top.joylife.lemon.dao;

import java.util.List;

public interface ResourcesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Resources record);

    int insertSelective(Resources record);

    List<String> selectResourceByUserId(Integer userId);

    Resources selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Resources record);

    int updateByPrimaryKey(Resources record);
}