package top.joylife.lemon.dao.entity;

import io.swagger.models.auth.In;
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

    /**
     * 文章id
     */
    private Integer articleId;

    /**
     * 标签名
     */
    private Integer tagId;
}
