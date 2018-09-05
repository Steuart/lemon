package top.joylife.lemon.dao.entity;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name = "user_site")
public class UserSite {

    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 名字
     */
    private String name;

    /**
     * 链接
     */
    private String url;

    private Date createDate;

    private Date updateDate;
}
