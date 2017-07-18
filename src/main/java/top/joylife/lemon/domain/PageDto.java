package top.joylife.lemon.domain;

/**
 * 分页查询参数
 * Created by HemingWu on 2017/2/7.
 */
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

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

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
