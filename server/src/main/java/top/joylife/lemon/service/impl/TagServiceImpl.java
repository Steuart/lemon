package top.joylife.lemon.service.impl;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.joylife.lemon.domain.PageDto;
import top.joylife.lemon.entity.Tag;
import top.joylife.lemon.service.TagService;

/**
 * Created by HemingWu on 2017/2/7.
 */
@Service
public class TagServiceImpl implements TagService {
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
}
