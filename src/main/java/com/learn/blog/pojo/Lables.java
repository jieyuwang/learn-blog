package com.learn.blog.pojo;

import java.util.Date;

public class Lables {
    private Integer lablesId;

    private Integer lablesStatus;

    private Date lablesCreated;

    private String lablesContent;

    private String lablesDesc;

    public Integer getLablesId() {
        return lablesId;
    }

    public void setLablesId(Integer lablesId) {
        this.lablesId = lablesId;
    }

    public Integer getLablesStatus() {
        return lablesStatus;
    }

    public void setLablesStatus(Integer lablesStatus) {
        this.lablesStatus = lablesStatus;
    }

    public Date getLablesCreated() {
        return lablesCreated;
    }

    public void setLablesCreated(Date lablesCreated) {
        this.lablesCreated = lablesCreated;
    }

    public String getLablesContent() {
        return lablesContent;
    }

    public void setLablesContent(String lablesContent) {
        this.lablesContent = lablesContent == null ? null : lablesContent.trim();
    }

    public String getLablesDesc() {
        return lablesDesc;
    }

    public void setLablesDesc(String lablesDesc) {
        this.lablesDesc = lablesDesc == null ? null : lablesDesc.trim();
    }
}