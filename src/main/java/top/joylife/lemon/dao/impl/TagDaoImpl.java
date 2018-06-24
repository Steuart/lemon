package top.joylife.lemon.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.entity.Example;
import top.joylife.lemon.dao.TagDao;
import top.joylife.lemon.dao.entity.Tag;
import top.joylife.lemon.dao.mapper.TagMapper;
import java.util.List;

/**
 * created by wuhaiming on 2018/6/20
 */
@Repository
public class TagDaoImpl implements TagDao {

    @Autowired
    private TagMapper tagMapper;

    /**
     * 根据名字获取标签
     *
     * @param name
     * @return
     */
    @Override
    public Tag getByName(String name) {
        Example example = new Example(Tag.class);
        example.createCriteria()
                .andEqualTo("name",name);
        return tagMapper.selectOneByExample(example);
    }

    /**
     * 根据名字获取标签列表
     *
     * @param names
     * @return
     */
    @Override
    public List<Tag> listByName(List<String> names) {
        Example example = new Example(Tag.class);
        example.createCriteria()
                .andIn("name",names);
        return tagMapper.selectByExample(example);
    }

    /**
     * 根据id查询标签列表
     *
     * @param ids
     * @return
     */
    @Override
    public List<Tag> listById(List<Integer> ids) {
        Example example = new Example(Tag.class);
        example.createCriteria()
                .andIn("id",ids);
        return tagMapper.selectByExample(example);
    }

    /**
     * 添加标签
     *
     * @param tag
     * @return
     */
    @Override
    public Integer add(Tag tag) {
        return tagMapper.insertSelective(tag);
    }

    /**
     * 批量添加
     *
     * @param tags
     * @return
     */
    @Override
    public List<Tag> batchAdd(List<Tag> tags) {
        tagMapper.insertList(tags);
        return tags;
    }
}
