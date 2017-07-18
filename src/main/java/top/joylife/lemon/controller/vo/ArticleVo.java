package top.joylife.lemon.controller.vo;

import top.joylife.lemon.entity.Article;
import top.joylife.lemon.entity.ArticleContent;
import top.joylife.lemon.entity.Tag;

import java.util.List;

/**
 * Created by HemingWu on 2017/2/7.
 */
public class ArticleVo {

    private Article article;

    private List<Tag> tags;

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

}
