package top.joylife.lemon.service;

import com.github.pagehelper.PageInfo;
import top.joylife.lemon.common.bean.vo.ArticleInfoVo;
import top.joylife.lemon.common.bean.vo.ArticleVo;
import top.joylife.lemon.common.bean.domain.ArticleDto;
import top.joylife.lemon.common.bean.domain.PageDto;
import top.joylife.lemon.entity.Article;

import java.util.List;

/**
 * Created by HemingWu on 2017/2/7.
 */
public interface ArticleService {

    /**
     * 添加文章
     * @param articleDto
     * @return
     */
    int addArticle(ArticleDto articleDto);

    /**
     * 更新文章
     * @param articleDto
     * @return
     */
    int updateArticle(ArticleDto articleDto);

    /**
     * 更新文章状态
     * @param statusCode
     * @param articleId
     * @return
     */
    int updateStatus(byte statusCode,int articleId);

    /**
     * 更新文章标签
     * @param tagIds
     * @return
     */
    int updateTags(Integer[] tagIds);

    /**
     * 获取文章分页列表
     * @param pageDto
     * @return
     */
    PageInfo<ArticleVo> pageList(PageDto pageDto);

    /**
     * 获取热门文章列表
     * @return
     */
    List<Article> getHotArticles();

    /**
     * 获取文章内容信息
     *
     *
     * @param articleId
     * @return
     */
    ArticleInfoVo getArticleInfo(Integer articleId);
}
