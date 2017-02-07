package top.joylife.lemon.service;

import top.joylife.lemon.domain.PageDto;

import java.util.List;

/**
 * Created by HeimingWu on 2017/2/7.
 */
public interface SuperService<T> {

    /**
     * 增加
     * @param entity
     * @return
     */
    int add(T entity);

    /**
     * 删除
     * @param id
     * @return
     */
    int remove(int id);

    /**
     * 逻辑删除
     * @param id
     * @return
     */
    int logicRemove(int id);

    /**
     * 修改
     * @param entity
     * @return
     */
    int modify(T entity);

    /**
     * 分页获取数据列表
     * @param pageDto
     * @return
     */
    List<T> pageList(PageDto pageDto);

}
