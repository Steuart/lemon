package top.joylife.lemon.test.dao;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.joylife.lemon.dao.MenuDao;
import top.joylife.lemon.dao.entity.Menu;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class MenuDaoTest {

    @Autowired
    private MenuDao menuDao;

    @Test
    public void add(){
        List<Menu> menuList = new ArrayList<>();
        Menu menu = new Menu();
        menu.setLabel("首页");
        menu.setRemark("首页");
        menu.setNumber(1);
        menu.setParentId(0);
        menu.setUrl("http://www.joylife.top");
        menuList.add(menu);

        Menu travel = new Menu();
        travel.setLabel("侣行");
        travel.setRemark("风景风景");
        travel.setNumber(2);
        travel.setParentId(0);
        travel.setUrl("http://www.joylife.top/travel");
        menuList.add(travel);

        Menu food = new Menu();
        food.setLabel("美食");
        food.setRemark("好吃的");
        food.setNumber(3);
        food.setParentId(0);
        food.setUrl("http://www.joylife.top/food");
        menuList.add(food);

        Menu cat = new Menu();
        cat.setParentId(0);
        cat.setLabel("猫");
        cat.setNumber(4);
        cat.setRemark("喵喵喵");
        cat.setUrl("http://www.joylife.top/cat");
        menuList.add(cat);
        menuList.forEach(menu1 -> {
            try{
                menuDao.add(menu1);
            }catch (Exception e){
                log.info("msg:{}",e.getMessage());
            }
        });
    }

    @Test
    public void listAllTest(){
        List<Menu> menus = menuDao.listAll();
        log.info("menus:{}",JSON.toJSONString(menus));
    }
}
