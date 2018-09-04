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
@Table(name = "tag")
public class Tag {

    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 标签名字
     */
    private String name;

    /**
     * 标签下的文章数
     */
    private Integer articleNumber;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 更新时间
     */
    private Date updateDate;

    /**
     * 删除时间
     */
    private Date deleteDate;
}
