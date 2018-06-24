package top.joylife.lemon.service;

import top.joylife.lemon.dao.entity.ArticleTag;

import java.util.List;

/**
 * created by wuhaiming on 2018/2/9
 */
public interface ArticleTagService {

    /**
     * 批量添加
     * @param articleTags
     */
    void batchAdd(List<ArticleTag> articleTags);
}
