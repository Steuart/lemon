package top.joylife.lemon.dao;

import top.joylife.lemon.dao.entity.Tag;

import java.util.List;

/**
 * created by wuhaiming on 2018/6/20
 */
public interface TagDao {

    /**
     * 根据名字获取标签
     * @param name
     * @return
     */
    Tag getByName(String name);

    /**
     * 根据名字获取标签列表
     * @param names
     * @return
     */
    List<Tag> listByName(List<String> names);

    /**
     * 根据id查询标签列表
     * @param ids
     * @return
     */
    List<Tag> listById(List<Integer> ids);

    /**
     * 添加标签
     * @param tag
     * @return
     */
    Integer add(Tag tag);

    /**
     * 批量添加
     * @param tags
     * @return
     */
    List<Tag> batchAdd(List<Tag> tags);
}
