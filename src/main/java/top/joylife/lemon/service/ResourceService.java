package top.joylife.lemon.service;

import com.github.pagehelper.PageInfo;
import top.joylife.lemon.common.bean.domain.PageDto;
import top.joylife.lemon.entity.Resource;

/**
 * Created by HemingWu on 2017/2/7.
 */
public interface ResourceService {

    /**
     * 添加资源
     * @param resource
     * @return
     */
    int addResource(Resource resource);

    /**
     * 更新资源
     * @param resource
     * @return
     */
    int updateResource(Resource resource);

    /**
     * 资源列表
     * @param pageDto
     * @return
     */
    PageInfo<Resource> getPageList(PageDto pageDto);
}
