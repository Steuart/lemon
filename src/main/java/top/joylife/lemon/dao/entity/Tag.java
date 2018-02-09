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

    private String name;

    private Integer articleNumber;

    private String color;

    private Date dateCreate;

    private Date dateUpdate;

    private Date dateDelete;
}
