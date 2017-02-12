package top.joylife.lemon.service;

import top.joylife.lemon.entity.Page;

import java.util.List;
import java.util.Map;

/**
 * Created by HemingWu on 2017/2/7.
 */
public interface PageService {

    /**
     * 增加页面
     * @param page
     * @return
     */
    int addPage(Page page);

    /**
     * 更新页面
     * @param page
     * @return
     */
    int updatePage(Page page);

    /**
     * 删除页面
     * @param pageId
     * @return
     */
    int removePage(int pageId);

    /**
     * 获取页面树状列表
     * @return
     */
    List<Map<String,Object>> getPageTree();
}
