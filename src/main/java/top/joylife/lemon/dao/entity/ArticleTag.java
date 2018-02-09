package top.joylife.lemon.dao.entity;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * created by wuhaiming on 2018/2/9
 */
@Data
@Table(name = "article_tag")
public class ArticleTag {

    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    private Integer articleId;

    private Integer tagId;
}
