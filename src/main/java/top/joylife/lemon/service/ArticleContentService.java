package top.joylife.lemon.service;

import top.joylife.lemon.entity.ArticleContent;

/**
 * Created by HemingWu on 2017/2/7.
 */
public interface ArticleContentService {

    /**
     * 添加文章内容
     */
    int addContent(ArticleContent articleContent);

    /**
     * 更新文章内容
     */
    int updateContent(ArticleContent articleContent);
}
