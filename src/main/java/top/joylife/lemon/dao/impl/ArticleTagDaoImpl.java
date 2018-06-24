package top.joylife.lemon.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;
import tk.mybatis.mapper.entity.Example;
import top.joylife.lemon.dao.ArticleTagDao;
import top.joylife.lemon.dao.entity.ArticleTag;
import top.joylife.lemon.dao.mapper.ArticleTagMapper;

import java.util.List;

/**
 * created by wuhaiming on 2018/6/20
 */
@Repository
public class ArticleTagDaoImpl implements ArticleTagDao {


    @Autowired
    private ArticleTagMapper articleTagMapper;

    /**
     * 批量添加
     *
     * @param articleTags
     */
    @Override
    public void batchAdd(List<ArticleTag> articleTags) {
        articleTagMapper.insertList(articleTags);
    }

    /**
     * 批量删除
     *
     * @param ids
     */
    @Override
    public void batchDelete(List<Integer> ids) {
        if(!CollectionUtils.isEmpty(ids)){
            return;
        }
        Example example = new Example(ArticleTag.class);
        example.createCriteria()
                .andIn("id",ids);
        articleTagMapper.deleteByExample(example);
    }

    /**
     * 根据文章id删除
     *
     * @param articleId
     */
    @Override
    public void deleteByArticleId(Integer articleId) {
        if(articleId==null){
            return;
        }
        Example example = new Example(ArticleTag.class);
        example.createCriteria()
                .andEqualTo("articleId",articleId);
        articleTagMapper.deleteByExample(example);
    }

    /**
     * 根据文章id查询
     *
     * @param articleId
     * @return
     */
    @Override
    public List<ArticleTag> listByArticleId(Integer articleId) {
        Example example = new Example(ArticleTag.class);
        example.createCriteria()
                .andEqualTo("articleId",articleId);
        return articleTagMapper.selectByExample(example);
    }
}
