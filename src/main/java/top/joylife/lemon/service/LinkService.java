package top.joylife.lemon.service;

import top.joylife.lemon.domain.ListDto;
import top.joylife.lemon.entity.Link;

import java.util.List;

/**
 * Created by HemingWu on 2017/2/7.
 */
public interface LinkService {

    /**
     * 添加链接
     * @param link
     * @return
     */
    int addLink(Link link);

    /**
     * 更新链接
     * @param link
     * @return
     */
    int updateLink(Link link);

    /**
     * 更新链接状态
     * @param linkId
     * @param statusCode
     * @return
     */
    int updateStatus(int linkId,byte statusCode);

    /**
     * 获取连接列表
     * @return
     */
    List<Link> getList(ListDto listDto);
}
