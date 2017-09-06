package top.joylife.lemon.service.impl;

import com.github.pagehelper.PageInfo;
import top.joylife.lemon.common.bean.domain.PageDto;
import top.joylife.lemon.entity.Resource;
import top.joylife.lemon.service.ResourceService;

/**
 * Created by HemingWu on 2017/2/7.
 */
public class ResourceServiceImpl implements ResourceService{
    /**
     * 添加资源
     *
     * @param resource
     * @return
     */
    @Override
    public int addResource(Resource resource) {
        return 0;
    }

    /**
     * 更新资源
     *
     * @param resource
     * @return
     */
    @Override
    public int updateResource(Resource resource) {
        return 0;
    }

    /**
     * 资源列表
     *
     * @param pageDto
     * @return
     */
    @Override
    public PageInfo<Resource> getPageList(PageDto pageDto) {
        return null;
    }
}
