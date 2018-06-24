package top.joylife.lemon.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.joylife.lemon.dao.ArticleTagDao;
import top.joylife.lemon.dao.entity.ArticleTag;
import top.joylife.lemon.service.ArticleTagService;

import java.util.List;

/**
 * created by wuhaiming on 2018/2/9
 */
@Service
public class ArticleTagServiceImpl implements ArticleTagService{


    @Autowired
    private ArticleTagDao articleTagDao;

    /**
     * 批量添加
     *
     * @param articleTags
     */
    @Override
    public void batchAdd(List<ArticleTag> articleTags) {
        
    }
}
