/*
 * This file is generated by jOOQ.
*/
package top.joylife.lemon.jooq.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 评论
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TComment implements Serializable {

    private static final long serialVersionUID = 986314280;

    private Integer   id;
    private Integer   userId;
    private Integer   articleId;
    private String    content;
    private Timestamp createTime;
    private Boolean   deleteFlag;
    private Boolean   status;
    private String    userHeadImg;
    private String    userName;

    public TComment() {}

    public TComment(TComment value) {
        this.id = value.id;
        this.userId = value.userId;
        this.articleId = value.articleId;
        this.content = value.content;
        this.createTime = value.createTime;
        this.deleteFlag = value.deleteFlag;
        this.status = value.status;
        this.userHeadImg = value.userHeadImg;
        this.userName = value.userName;
    }

    public TComment(
        Integer   id,
        Integer   userId,
        Integer   articleId,
        String    content,
        Timestamp createTime,
        Boolean   deleteFlag,
        Boolean   status,
        String    userHeadImg,
        String    userName
    ) {
        this.id = id;
        this.userId = userId;
        this.articleId = articleId;
        this.content = content;
        this.createTime = createTime;
        this.deleteFlag = deleteFlag;
        this.status = status;
        this.userHeadImg = userHeadImg;
        this.userName = userName;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getArticleId() {
        return this.articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Boolean getDeleteFlag() {
        return this.deleteFlag;
    }

    public void setDeleteFlag(Boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Boolean getStatus() {
        return this.status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getUserHeadImg() {
        return this.userHeadImg;
    }

    public void setUserHeadImg(String userHeadImg) {
        this.userHeadImg = userHeadImg;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TComment (");

        sb.append(id);
        sb.append(", ").append(userId);
        sb.append(", ").append(articleId);
        sb.append(", ").append(content);
        sb.append(", ").append(createTime);
        sb.append(", ").append(deleteFlag);
        sb.append(", ").append(status);
        sb.append(", ").append(userHeadImg);
        sb.append(", ").append(userName);

        sb.append(")");
        return sb.toString();
    }
}
