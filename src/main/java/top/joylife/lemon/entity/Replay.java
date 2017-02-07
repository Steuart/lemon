package top.joylife.lemon.entity;

import java.util.Date;

public class Replay {
    private Integer id;

    private Integer commentId;

    private Integer replayId;

    private String replayHeadImg;

    private String replayName;

    private String content;

    private String targetName;

    private Integer targetId;

    private Date createTime;

    private Byte status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getReplayId() {
        return replayId;
    }

    public void setReplayId(Integer replayId) {
        this.replayId = replayId;
    }

    public String getReplayHeadImg() {
        return replayHeadImg;
    }

    public void setReplayHeadImg(String replayHeadImg) {
        this.replayHeadImg = replayHeadImg == null ? null : replayHeadImg.trim();
    }

    public String getReplayName() {
        return replayName;
    }

    public void setReplayName(String replayName) {
        this.replayName = replayName == null ? null : replayName.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getTargetName() {
        return targetName;
    }

    public void setTargetName(String targetName) {
        this.targetName = targetName == null ? null : targetName.trim();
    }

    public Integer getTargetId() {
        return targetId;
    }

    public void setTargetId(Integer targetId) {
        this.targetId = targetId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}