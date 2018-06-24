package top.joylife.lemon.service;

import top.joylife.lemon.dao.entity.Tag;

import java.util.List;

/**
 * created by wuhaiming on 2018/2/9
 */
public interface TagService {

    /**
     * 批量添加标签
     * @param tags
     * @return
     */
    List<Tag> batchAdd(List<Tag> tags);
}
