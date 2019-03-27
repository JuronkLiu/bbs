package com.bbs.pojo;

import java.util.Date;

public class CatetoryInfo {
    private String catetoryId;

    private String catetoryName;

    private String parentId;

    private Date createDate;

    private Date updateDate;

    private Integer isDown;

    private Integer isDel;

    public String getCatetoryId() {
        return catetoryId;
    }

    public void setCatetoryId(String catetoryId) {
        this.catetoryId = catetoryId == null ? null : catetoryId.trim();
    }

    public String getCatetoryName() {
        return catetoryName;
    }

    public void setCatetoryName(String catetoryName) {
        this.catetoryName = catetoryName == null ? null : catetoryName.trim();
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
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

    public Integer getIsDown() {
        return isDown;
    }

    public void setIsDown(Integer isDown) {
        this.isDown = isDown;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }
}