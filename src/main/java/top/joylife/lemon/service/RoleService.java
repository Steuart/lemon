package top.joylife.lemon.service;

import top.joylife.lemon.entity.Role;

/**
 * Created by HemingWu on 2017/2/7.
 */
public interface RoleService {

    /**
     * 添加角色
     * @param role
     * @return
     */
    int addRole(Role role);

    /**
     * 更新角色
     * @param role
     * @return
     */
    int updateRole(Role role);

    /**
     * 更新角色状态
     * @param roleId
     * @param statusCode
     * @return
     */
    int updateStatus(int roleId,byte statusCode);
}
