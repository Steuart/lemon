package top.joylife.lemon.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import top.joylife.lemon.dao.ArticleDao;
import top.joylife.lemon.dao.entity.Article;
import top.joylife.lemon.dao.mapper.ArticleMapper;

import java.util.Date;

/**
 * created by wuhaiming on 2018/6/20
 */
@Repository
public class ArticleDaoImpl implements ArticleDao {

    @Autowired
    private ArticleMapper articleMapper;

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    @Override
    public Article get(Integer id) {
        return articleMapper.selectByPrimaryKey(id);
    }

    /**
     * 保存
     *
     * @param article
     * @return
     */
    @Override
    public Integer save(Article article) {
        return articleMapper.insertSelective(article);
    }

    /**
     * 更新
     *
     * @param article
     * @return
     */
    @Override
    public Integer update(Article article) {
        return articleMapper.updateByPrimaryKeySelective(article);
    }

    /**
     * 删除
     *
     * @param articleId
     */
    @Override
    public void delete(Integer articleId) {
        Article param = new Article();
        param.setDateDelete(new Date());
        param.setId(articleId);
        articleMapper.updateByPrimaryKeySelective(param);
    }
}
