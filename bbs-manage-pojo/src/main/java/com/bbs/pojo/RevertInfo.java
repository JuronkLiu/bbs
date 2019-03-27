package com.bbs.pojo;

import java.util.Date;

public class RevertInfo {
    private String revertId;

    private String userId;

    private String postId;

    private String parentRevertId;

    private String revertMessage;

    private Integer revertFineNum;

    private Date createDate;

    private Integer isDel;

    private String delUserId;

    private String delReason;

    public String getRevertId() {
        return revertId;
    }

    public void setRevertId(String revertId) {
        this.revertId = revertId == null ? null : revertId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId == null ? null : postId.trim();
    }

    public String getParentRevertId() {
        return parentRevertId;
    }

    public void setParentRevertId(String parentRevertId) {
        this.parentRevertId = parentRevertId == null ? null : parentRevertId.trim();
    }

    public String getRevertMessage() {
        return revertMessage;
    }

    public void setRevertMessage(String revertMessage) {
        this.revertMessage = revertMessage == null ? null : revertMessage.trim();
    }

    public Integer getRevertFineNum() {
        return revertFineNum;
    }

    public void setRevertFineNum(Integer revertFineNum) {
        this.revertFineNum = revertFineNum;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public String getDelUserId() {
        return delUserId;
    }

    public void setDelUserId(String delUserId) {
        this.delUserId = delUserId == null ? null : delUserId.trim();
    }

    public String getDelReason() {
        return delReason;
    }

    public void setDelReason(String delReason) {
        this.delReason = delReason == null ? null : delReason.trim();
    }
}