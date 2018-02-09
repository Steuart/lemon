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

    private String username;

    private String nickname;

    private String password;

    private String phone;

    private String email;

    private Date dateCreate;

    private Date dateUpdate;

    private Date dateDelete;

}
