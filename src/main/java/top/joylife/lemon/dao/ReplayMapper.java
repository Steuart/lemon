package top.joylife.lemon.dao;

import top.joylife.lemon.entity.Replay;

public interface ReplayMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Replay record);

    int insertSelective(Replay record);

    Replay selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Replay record);

    int updateByPrimaryKey(Replay record);
}