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
@Table(name = "article")
public class Article {

    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;
    /**
     * 文章标题
     */
    private String title;

    /**
     * 作者id
     */
    private String authorId;
    /**
     * 作者
     */
    private String authorName;

    private String coverImg;

    private String summary;

    private String classifyId;

    private String html;

    private String markdown;

    private Date dateCreate;

    private Date dateUpdate;

    private Date dateDelete;
}
