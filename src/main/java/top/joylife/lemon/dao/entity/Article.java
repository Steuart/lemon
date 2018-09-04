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

    /**
     * 封面图片
     */
    private String coverImg;

    /**
     * 摘要
     */
    private String summary;

    /**
     * 分类id
     */
    private Integer classifyId;

    /**
     * html内容
     */
    private String html;

    /**
     * markdown内容
     */
    private String markdown;

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
