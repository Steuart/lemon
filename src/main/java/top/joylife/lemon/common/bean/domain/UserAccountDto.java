package top.joylife.lemon.common.bean.domain;

import lombok.Data;
import top.joylife.lemon.entity.Account;
import top.joylife.lemon.entity.User;

/**
 * Created by HemingWu on 2017/2/7.
 */
@Data
public class UserAccountDto {

    private User user;

    private Account account;

    private Integer[] roleIds;

}
