package top.joylife.lemon.common.bean.vo;

import lombok.Data;
import top.joylife.lemon.entity.Article;
import top.joylife.lemon.entity.ArticleContent;
import top.joylife.lemon.entity.Tag;

import java.util.List;

/**
 * Created by HemingWu on 2017/2/7.
 */
@Data
public class ArticleVo {

    private Article article;

    private List<Tag> tags;

}
