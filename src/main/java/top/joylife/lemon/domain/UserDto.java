package top.joylife.lemon.domain;

import top.joylife.lemon.entity.Account;
import top.joylife.lemon.entity.User;

/**
 * Created by HemingWu on 2017/2/7.
 */
public class UserDto {

    private User user;

    private Account account;

    private String roleIds;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(String roleIds) {
        this.roleIds = roleIds;
    }
}
