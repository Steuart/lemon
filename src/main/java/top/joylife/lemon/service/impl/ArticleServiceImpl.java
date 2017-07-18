package top.joylife.lemon.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import top.joylife.lemon.common.cache.SystemCache;
import top.joylife.lemon.controller.vo.ArticleInfoVo;
import top.joylife.lemon.controller.vo.ArticleVo;
import top.joylife.lemon.controller.vo.TagVo;
import top.joylife.lemon.dao.ArticleMapper;
import top.joylife.lemon.dao.TagMapper;
import top.joylife.lemon.domain.ArticleDto;
import top.joylife.lemon.domain.PageDto;
import top.joylife.lemon.entity.Article;
import top.joylife.lemon.entity.ArticleContent;
import top.joylife.lemon.entity.Tag;
import top.joylife.lemon.service.ArticleService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by HemingWu on 2017/2/7.
 */
@Service
public class ArticleServiceImpl implements ArticleService{


    @Resource
    private ArticleMapper articleMapper;

    @Resource
    private TagMapper tagMapper;

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
        Integer pageSize = Integer.valueOf(SystemCache.get("pagesize"));
        int pageNo = pageDto.getPageNo();
        PageHelper.startPage(pageNo, pageSize);
        List<Article> articles = articleMapper.selectList(pageDto);
        PageInfo<Article> articlePageInfo = new PageInfo<>(articles);
        List<ArticleVo> articleVos = new ArrayList<>();
        if(articles!=null && articles.size()!=0){
            List<Integer> ids = new ArrayList<>();
            for(Article article:articles){
                ids.add(article.getId());
                ArticleVo articleVo = new ArticleVo();
                articleVo.setArticle(article);
                articleVos.add(articleVo);
            }
            List<TagVo> tagVos = tagMapper.getTagsByArticleId(ids);
            Map<Integer,List<Tag>> articleTags = new HashMap<>();
            for(TagVo tagVo:tagVos){
                Integer articleId = tagVo.getArticleId();
                List<Tag> tags = articleTags.get(articleId);
                Tag tag = new Tag();
                tag.setArticleCount(tagVo.getArticleCount());
                tag.setBgColor(tagVo.getBgColor());
                tag.setCreateTime(tagVo.getCreateTime());
                tag.setUpdateTime(tagVo.getUpdateTime());
                tag.setFontColor(tagVo.getFontColor());
                tag.setId(tagVo.getId());
                tag.setName(tagVo.getName());
                tag.setStatus(tagVo.getStatus());
                if(tags ==null){
                    List<Tag> newTags = new ArrayList<>();
                    newTags.add(tag);
                    articleTags.put(articleId,newTags);
                }else {
                    tags.add(tag);
                }
            }

            for(ArticleVo articleVo:articleVos){
                articleVo.setTags(articleTags.get(articleVo.getArticle().getId()));
            }
        }

        PageInfo pageInfo = new PageInfo(articleVos);
        pageInfo.setNextPage(articlePageInfo.getNextPage());
        pageInfo.setPrePage(articlePageInfo.getPrePage());
        pageInfo.setHasNextPage(articlePageInfo.isHasNextPage());
        pageInfo.setHasPreviousPage(articlePageInfo.isHasPreviousPage());
        return pageInfo;
    }

    /**
     * 获取热门文章列表
     * @return
     */
    @Override
    public List<Article> getHotArticles() {
        Integer pageSize = Integer.valueOf(SystemCache.get("article.hot.size"));
        List<Article> articles = articleMapper.getHotArticles(pageSize);
        return articles;
    }

    /**
     * 获取文章内容信息
     *
     * @param articleId
     * @return
     */
    @Override
    public ArticleInfoVo getArticleInfo(Integer articleId) {

        ArticleInfoVo articleInfoVo =articleMapper.getArticleInfo(articleId);

        return articleInfoVo;
    }
}
