package top.joylife.lemon.controller.vo;

import top.joylife.lemon.entity.Tag;

import java.util.Date;
import java.util.List;

/**
 * Created by HemingWu on 2017/2/7.
 */
public class ArticleVo {

    private Integer id;

    private String title;

    private String summary;

    private String author;

    private String source;

    private Integer sort;

    private Integer clickNo;

    private Integer scanNo;

    private Integer commentNo;

    /**
     * 点赞人数
     */
    private Integer praiseNo;

    /**
     * 踩的人数
     */
    private Integer treadNo;

    private Date createTime;

    private Date updateTime;

    private Byte status;

    private List<Tag> tags;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getClickNo() {
        return clickNo;
    }

    public void setClickNo(Integer clickNo) {
        this.clickNo = clickNo;
    }

    public Integer getScanNo() {
        return scanNo;
    }

    public void setScanNo(Integer scanNo) {
        this.scanNo = scanNo;
    }

    public Integer getCommentNo() {
        return commentNo;
    }

    public void setCommentNo(Integer commentNo) {
        this.commentNo = commentNo;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public Integer getPraiseNo() {
        return praiseNo;
    }

    public void setPraiseNo(Integer praiseNo) {
        this.praiseNo = praiseNo;
    }

    public Integer getTreadNo() {
        return treadNo;
    }

    public void setTreadNo(Integer treadNo) {
        this.treadNo = treadNo;
    }
}
