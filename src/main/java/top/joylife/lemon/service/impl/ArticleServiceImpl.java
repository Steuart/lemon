package top.joylife.lemon.service.impl;

import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import top.joylife.lemon.controller.vo.ArticleVo;
import top.joylife.lemon.domain.ArticleDto;
import top.joylife.lemon.domain.PageDto;
import top.joylife.lemon.entity.ArticleContent;
import top.joylife.lemon.service.ArticleService;

/**
 * Created by HemingWu on 2017/2/7.
 */
@Service
public class ArticleServiceImpl implements ArticleService{
    /**
     * 添加文章
     *
     * @param articleDto
     * @return
     */
    @Override
    public int addArticle(ArticleDto articleDto) {
        return 0;
    }

    /**
     * 更新文章
     *
     * @param articleDto
     * @return
     */
    @Override
    public int updateArticle(ArticleDto articleDto) {
        return 0;
    }

    /**
     * 更新文章状态
     *
     * @param statusCode
     * @param articleId
     * @return
     */
    @Override
    public int updateStatus(byte statusCode, int articleId) {
        return 0;
    }

    /**
     * 更新文章标签
     *
     * @param tagIds
     * @return
     */
    @Override
    public int updateTags(Integer[] tagIds) {
        return 0;
    }

    /**
     * 获取文章分页列表
     *
     * @param pageDto
     * @return
     */
    @Override
    public PageInfo<ArticleVo> pageList(PageDto pageDto) {
        return null;
    }

    /**
     * 获取文章内容信息
     *
     * @param articleId
     * @return
     */
    @Override
    public ArticleVo getArticleInfo(Integer articleId) {
        return null;
    }
}
