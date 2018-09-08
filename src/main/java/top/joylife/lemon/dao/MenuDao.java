package top.joylife.lemon.dao;

import top.joylife.lemon.dao.entity.Menu;

import java.util.List;

public interface MenuDao {
    /**
     * 添加菜单
     * @param menu
     * @return
     */
    Integer add(Menu menu);

    /**
     * 根据id获取菜单
     * @param id
     * @return
     */
    Menu getById(Integer id);

    /**
     * 更新菜单
     * @param menu
     * @return
     */
    Integer update(Menu menu);

    /**
     * 删除菜单
     * @param id
     */
    void delete(Integer id);

    /**
     * 获取所有菜单
     * @return
     */
    List<Menu> listAll();
}
