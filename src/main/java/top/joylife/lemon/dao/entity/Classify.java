package top.joylife.lemon.dao.entity;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * created by wuhaiming on 2018/6/20
 */
@Data
@Table(name = "classify")
public class Classify {

    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 分类名字
     */
    private String name;

    /**
     * 创建时间
     */
    private Date createDate;

}
