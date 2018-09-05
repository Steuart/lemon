package top.joylife.lemon.dao.entity;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name = "settings")
public class Settings {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 名字
     */
    private String name;

    /**
     * 值
     */
    private String value;

    private Date updateDate;

    private Date createDate;
}
