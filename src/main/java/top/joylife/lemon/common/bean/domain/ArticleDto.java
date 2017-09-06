package top.joylife.lemon.common.bean.domain;

import lombok.Data;
import top.joylife.lemon.entity.Article;
import top.joylife.lemon.entity.ArticleContent;

/**
 * Created by HemingWu on 2017/2/7.
 */
@Data
public class ArticleDto {

    private Article article;

    private ArticleContent articleContent;

    private Integer[] tagIds;
}
