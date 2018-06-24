package top.joylife.lemon.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.joylife.lemon.dao.TagDao;
import top.joylife.lemon.dao.entity.Tag;
import top.joylife.lemon.service.TagService;

import java.util.List;

/**
 * created by wuhaiming on 2018/2/9
 */
@Service
public class TagServiceImpl implements TagService {

    @Autowired
    private TagDao tagDao;


    /**
     * 批量添加标签
     *
     * @param tags
     * @return
     */
    @Override
    public List<Tag> batchAdd(List<Tag> tags) {
        tagDao.batchAdd(tags);
        return tags;
    }
}
