package top.joylife.lemon.domain;

import top.joylife.lemon.entity.Article;
import top.joylife.lemon.entity.ArticleContent;

/**
 * Created by HemingWu on 2017/2/7.
 */
public class ArticleDto {

    private Article article;

    private ArticleContent articleContent;

    private Integer[] tagIds;

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public Integer[] getTagIds() {
        return tagIds;
    }

    public void setTagIds(Integer[] tagIds) {
        this.tagIds = tagIds;
    }

    public ArticleContent getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(ArticleContent articleContent) {
        this.articleContent = articleContent;
    }
}
