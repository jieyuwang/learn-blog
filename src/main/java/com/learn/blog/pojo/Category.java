package com.learn.blog.pojo;

import java.util.Date;

public class Category {
    private Integer categoryId;

    private Integer categoryStatus;

    private Date categoryCreated;

    private String categoryContent;

    private String categoryDesc;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getCategoryStatus() {
        return categoryStatus;
    }

    public void setCategoryStatus(Integer categoryStatus) {
        this.categoryStatus = categoryStatus;
    }

    public Date getCategoryCreated() {
        return categoryCreated;
    }

    public void setCategoryCreated(Date categoryCreated) {
        this.categoryCreated = categoryCreated;
    }

    public String getCategoryContent() {
        return categoryContent;
    }

    public void setCategoryContent(String categoryContent) {
        this.categoryContent = categoryContent == null ? null : categoryContent.trim();
    }

    public String getCategoryDesc() {
        return categoryDesc;
    }

    public void setCategoryDesc(String categoryDesc) {
        this.categoryDesc = categoryDesc == null ? null : categoryDesc.trim();
    }
}