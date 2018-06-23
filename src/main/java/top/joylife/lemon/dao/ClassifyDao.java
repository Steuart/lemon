package top.joylife.lemon.dao;

import io.swagger.models.auth.In;
import top.joylife.lemon.dao.entity.Classify;

import java.util.List;

/**
 * created by wuhaiming on 2018/6/20
 */
public interface ClassifyDao {

    /**
     * 查询分类列表
     * @return
     */
    List<Classify> list();

    /**
     * 根据id查询
     * @return
     */
    Classify getById(Integer id);

    /**
     * 根据id列表查询
     * @param ids
     * @return
     */
    List<Classify> listByIds(List<Integer> ids);

    /**
     * 保存
     * @param classify
     * @return
     */
    Integer save(Classify classify);
}
