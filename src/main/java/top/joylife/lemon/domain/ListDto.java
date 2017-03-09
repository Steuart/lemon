package top.joylife.lemon.domain;

/**
 * Created by HemingWu on 2017/2/7.
 */
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

    public String getOrderField() {
        return orderField;
    }

    public void setOrderField(String orderField) {
        this.orderField = orderField;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getSearchParam() {
        return searchParam;
    }

    public void setSearchParam(String searchParam) {
        this.searchParam = searchParam;
    }
}
