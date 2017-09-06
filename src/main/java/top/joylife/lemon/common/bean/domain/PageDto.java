package top.joylife.lemon.common.bean.domain;

import lombok.Data;

/**
 * 分页查询参数
 * Created by HemingWu on 2017/2/7.
 */
@Data
public class PageDto {
    /**
     * 页码
     */
    private int pageNo=1;

    /**
     * 每页数据大小
     */
    private int pageSize;

    /**
     * 排序字段
     */
    private String orderField;

    /**
     * 排序类型
     */
    private String orderType;

    /**
     * 搜索参数
     */
    private String searchParam;
}
