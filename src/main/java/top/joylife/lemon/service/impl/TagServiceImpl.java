package top.joylife.lemon.service.impl;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.joylife.lemon.common.cache.SystemCache;
import top.joylife.lemon.dao.TagMapper;
import top.joylife.lemon.domain.PageDto;
import top.joylife.lemon.entity.Tag;
import top.joylife.lemon.service.TagService;

import javax.annotation.Resource;
import java.util.List;
import java.util.Random;

/**
 * Created by HemingWu on 2017/2/7.
 */
@Service
public class TagServiceImpl implements TagService {

    private Random random = new Random();

    @Resource
    private TagMapper tagMapper;
    /**
     * 添加标签
     *
     * @param tag
     * @return
     */
    @Override
    public int addTag(Tag tag) {
        return 0;
    }

    /**
     * 更新标签
     *
     * @param tag
     * @return
     */
    @Override
    public int updateTag(Tag tag) {
        return 0;
    }

    /**
     * 更新标签状态
     *
     * @param tagId
     * @param statusCode
     * @return
     */
    @Override
    public int updateStatus(int tagId, byte statusCode) {
        return 0;
    }

    /**
     * 分页标签列表
     *
     * @param pageDto
     * @return
     */
    @Override
    public PageInfo<Tag> pageList(PageDto pageDto) {
        return null;
    }

    /**
     * 获取热门标签
     * @param size
     * @return
     */
    @Override
    public List<Tag> getHotTags(Integer size) {
        size = Integer.valueOf(SystemCache.get("tag.hot.size"));
        List<Tag> tags = tagMapper.getHotTags(size);
        double middle=1;
        if(tags!=null && tags.size()!=0){
            int max = tags.get(0).getArticleCount();
            int min = tags.get(tags.size()-1).getArticleCount();
            middle = (max+min)/2.0;
        }

        for(Tag tag:tags){
            tag.setFontSize(tag.getArticleCount()/middle+1);
        }

        for(Tag tag:tags){
            int index1 = random.nextInt(tags.size());
            int index2 = random.nextInt(tags.size());
            Tag tmp = tags.get(index1);
            tags.set(index1,tags.get(index2));
            tags.set(index2,tmp);
        }

        return tags;
    }
}
