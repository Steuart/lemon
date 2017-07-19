package top.joylife.lemon.service.impl;

import org.springframework.stereotype.Service;
import top.joylife.lemon.dao.LinkMapper;
import top.joylife.lemon.entity.Link;
import top.joylife.lemon.service.LinkService;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/7/19 0019.
 */

@Service
public class LinkServiceImpl implements LinkService {

    @Resource
    private LinkMapper linkMapper;

    @Override
    public List<Link> getLinkList() {
        List<Link> links = linkMapper.getLinks();
        return links;
    }
}
