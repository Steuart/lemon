package top.joylife.lemon.dao.entity;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name = "menu")
public class Menu {

    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 父节点id
     */
    private Integer parentId;
    /**
     * 名字
     */
    private String label;
    /**
     * 描述
     */
    private String describe;
    /**
     * 链接
     */
    private String url;

    private Date updateDate;

    private Date createDate;
}
