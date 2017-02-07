package top.joylife.lemon.service.impl;

import org.springframework.stereotype.Service;
import top.joylife.lemon.dao.UserMapper;
import top.joylife.lemon.domain.PageDto;
import top.joylife.lemon.domain.UserDto;
import top.joylife.lemon.entity.Account;
import top.joylife.lemon.entity.User;
import top.joylife.lemon.service.UserService;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by HemingWu on 2017/2/7.
 */
@Service
public class UserServiceImpl implements UserService{

    @Resource
    private UserMapper userMapper;
    /**
     * 增加
     *
     * @param entity
     * @return
     */
    @Override
    public int add(UserDto entity) {
        User user = entity.getUser();

        Account account = entity.getAccount();
        return 0;
    }

    /**
     * 删除
     *
     * @param id
     * @return
     */
    @Override
    public int remove(int id) {
        return 0;
    }

    /**
     * 逻辑删除
     *
     * @param id
     * @return
     */
    @Override
    public int logicRemove(int id) {
        return 0;
    }

    /**
     * 修改
     *
     * @param entity
     * @return
     */
    @Override
    public int modify(UserDto entity) {
        return 0;
    }

    /**
     * 分页获取数据列表
     *
     * @param pageDto
     * @return
     */
    @Override
    public List<UserDto> pageList(PageDto pageDto) {
        return null;
    }
}
