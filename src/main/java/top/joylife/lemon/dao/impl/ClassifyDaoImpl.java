package top.joylife.lemon.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.entity.Example;
import top.joylife.lemon.dao.ClassifyDao;
import top.joylife.lemon.dao.entity.Classify;
import top.joylife.lemon.dao.mapper.ClassifyMapper;

import java.util.List;

/**
 * created by wuhaiming on 2018/6/20
 */
@Repository
public class ClassifyDaoImpl implements ClassifyDao {

    @Autowired
    private ClassifyMapper classifyMapper;

    /**
     * 查询分类列表
     *
     * @return
     */
    @Override
    public List<Classify> list() {
        return classifyMapper.selectAll();
    }

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    @Override
    public Classify getById(Integer id) {
        return classifyMapper.selectByPrimaryKey(id);
    }

    /**
     * 根据id列表查询
     *
     * @param ids
     * @return
     */
    @Override
    public List<Classify> listByIds(List<Integer> ids) {
        Example example = new Example(Classify.class);
        example.createCriteria()
                .andIn("id",ids);
        return classifyMapper.selectByExample(example);
    }

    /**
     * 保存
     *
     * @param classify
     * @return
     */
    @Override
    public Integer save(Classify classify) {
        classifyMapper.insertSelective(classify);
        return classify.getId();
    }
}
