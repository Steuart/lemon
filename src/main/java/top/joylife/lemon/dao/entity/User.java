package top.joylife.lemon.dao.entity;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * created by wuhaiming on 2018/2/9
 */
@Data
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 昵称
     */
    private String nickname;
    /**
     * 封面
     */
    private String coverImg;
    /**
     * 头像
     */
    private String headImg;
    /**
     * 位置
     */
    private String location;
    /**
     * 手机号
     */
    private String phone;
    /**
     * 邮箱
     */
    private String email;

    /**
     * 类型
     */
    private Integer type;

    private Date createDate;

    private Date updateDate;

    private Date deleteDate;

}
