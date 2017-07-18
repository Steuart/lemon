package top.joylife.lemon.service;

import com.github.pagehelper.PageInfo;
import top.joylife.lemon.domain.PageDto;
import top.joylife.lemon.entity.Tag;

import java.util.List;

/**
 * Created by HemingWu on 2017/2/7.
 */
public interface TagService {

    /**
     * 添加标签
     * @param tag
     * @return
     */
    int addTag(Tag tag);

    /**
     * 更新标签
     * @param tag
     * @return
     */
    int updateTag(Tag tag);

    /**
     * 更新标签状态
     * @param id
     * @return
     */
    int updateStatus(int tagId,byte statusCode);

    /**
     * 分页标签列表
     * @param pageDto
     * @return
     */
    PageInfo<Tag> pageList(PageDto pageDto);

    /**
     * 获取热门标签
     * @param tagId
     * @return
     */
    List<Tag> getHotTags(Integer size);
}
