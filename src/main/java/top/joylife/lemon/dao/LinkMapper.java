package top.joylife.lemon.dao;

import top.joylife.lemon.entity.Link;

import java.util.List;

public interface LinkMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Link record);

    int insertSelective(Link record);

    Link selectByPrimaryKey(Integer id);

    /**
     * 获取链接列表
     * @return
     */
    List<Link> getLinks();

    int updateByPrimaryKeySelective(Link record);

    int updateByPrimaryKey(Link record);
}