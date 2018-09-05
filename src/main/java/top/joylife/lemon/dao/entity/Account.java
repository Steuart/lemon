package top.joylife.lemon.dao.entity;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name = "account")
public class Account {

    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 用户id
     */
    private Integer userId;
    /**
     * 账号
     */
    private String account;
    /**
     * 密码
     */
    private String password;
    /**
     * 类型
     */
    private String type;

    private Date createDate;

    private Date updateDate;

    private Date deleteDate;
}
