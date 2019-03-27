package com.bbs.pojo;

import java.util.Date;

public class PostInfo {
    private String postId;

    private String userId;

    private String catetoryId;

    private String postTitle;

    private Integer postClickNum;

    private Integer postRevertNum;

    private Integer postFineNum;

    private Date createDate;

    private Date updateDate;

    private Integer isOff;

    private String offReason;

    private Integer isDel;

    private String delReason;

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId == null ? null : postId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getCatetoryId() {
        return catetoryId;
    }

    public void setCatetoryId(String catetoryId) {
        this.catetoryId = catetoryId == null ? null : catetoryId.trim();
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle == null ? null : postTitle.trim();
    }

    public Integer getPostClickNum() {
        return postClickNum;
    }

    public void setPostClickNum(Integer postClickNum) {
        this.postClickNum = postClickNum;
    }

    public Integer getPostRevertNum() {
        return postRevertNum;
    }

    public void setPostRevertNum(Integer postRevertNum) {
        this.postRevertNum = postRevertNum;
    }

    public Integer getPostFineNum() {
        return postFineNum;
    }

    public void setPostFineNum(Integer postFineNum) {
        this.postFineNum = postFineNum;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Integer getIsOff() {
        return isOff;
    }

    public void setIsOff(Integer isOff) {
        this.isOff = isOff;
    }

    public String getOffReason() {
        return offReason;
    }

    public void setOffReason(String offReason) {
        this.offReason = offReason == null ? null : offReason.trim();
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public String getDelReason() {
        return delReason;
    }

    public void setDelReason(String delReason) {
        this.delReason = delReason == null ? null : delReason.trim();
    }
}