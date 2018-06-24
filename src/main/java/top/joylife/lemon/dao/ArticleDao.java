package top.joylife.lemon.dao;

import top.joylife.lemon.dao.entity.Article;

/**
 * created by wuhaiming on 2018/6/20
 */
public interface ArticleDao {

    /**
     * 根据id查询
     * @param id
     * @return
     */
    Article get(Integer id);

    /**
     * 保存
     * @param article
     * @return
     */
    Integer save(Article article);

    /**
     * 更新
     * @param article
     * @return
     */
    Integer update(Article article);

    /**
     * 删除
     * @param articleId
     */
    void delete(Integer articleId);
}
