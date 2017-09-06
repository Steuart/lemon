package top.joylife.lemon.common.bean.domain;

import lombok.Data;

/**
 * Created by HemingWu on 2017/2/7.
 */
@Data
public class ListDto {

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
