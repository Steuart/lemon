package top.joylife.lemon.dao;

import top.joylife.lemon.dao.entity.ArticleTag;

import java.util.List;

/**
 * created by wuhaiming on 2018/6/20
 */
public interface ArticleTagDao {

    /**
     * 批量添加
     * @param articleTags
     */
    void batchAdd(List<ArticleTag> articleTags);

    /**
     * 批量删除
     * @param tagIds
     */
    void batchDelete(List<Integer> ids);

    /**
     * 根据文章id删除
     * @param articleId
     */
    void deleteByArticleId(Integer articleId);

    /**
     * 根据文章id查询
     * @param articleId
     * @return
     */
    List<ArticleTag> listByArticleId(Integer articleId);
}
