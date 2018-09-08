package top.joylife.lemon.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.entity.Example;
import top.joylife.lemon.dao.MenuDao;
import top.joylife.lemon.dao.entity.Menu;
import top.joylife.lemon.dao.mapper.MenuMapper;

import java.util.List;

@Repository
public class MenuDaoImpl implements MenuDao {

    @Autowired
    private MenuMapper menuMapper;

    /**
     * 添加菜单
     *
     * @param menu
     * @return
     */
    @Override
    public Integer add(Menu menu) {
        menuMapper.insertSelective(menu);
        return menu.getId();
    }

    /**
     * 根据id获取菜单
     *
     * @param id
     * @return
     */
    @Override
    public Menu getById(Integer id) {
        return menuMapper.selectByPrimaryKey(id);
    }

    /**
     * 更新菜单
     *
     * @param menu
     * @return
     */
    @Override
    public Integer update(Menu menu) {
        return menuMapper.updateByPrimaryKeySelective(menu);
    }

    /**
     * 删除菜单
     *
     * @param id
     */
    @Override
    public void delete(Integer id) {
        menuMapper.deleteByPrimaryKey(id);
    }

    /**
     * 获取所有菜单
     *
     * @return
     */
    @Override
    public List<Menu> listAll() {
        return menuMapper.selectAll();
    }
}
