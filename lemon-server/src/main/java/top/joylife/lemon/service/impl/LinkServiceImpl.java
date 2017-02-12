package top.joylife.lemon.service.impl;

import top.joylife.lemon.domain.ListDto;
import top.joylife.lemon.entity.Link;
import top.joylife.lemon.service.LinkService;

import java.util.List;

/**
 * Created by HemingWu on 2017/2/7.
 */
public class LinkServiceImpl implements LinkService {
    /**
     * 添加链接
     *
     * @param link
     * @return
     */
    @Override
    public int addLink(Link link) {
        return 0;
    }

    /**
     * 更新链接
     *
     * @param link
     * @return
     */
    @Override
    public int updateLink(Link link) {
        return 0;
    }

    /**
     * 更新链接状态
     *
     * @param linkId
     * @param statusCode
     * @return
     */
    @Override
    public int updateStatus(int linkId, byte statusCode) {
        return 0;
    }

    /**
     * 获取连接列表
     *
     * @param listDto
     * @return
     */
    @Override
    public List<Link> getList(ListDto listDto) {
        return null;
    }
}
