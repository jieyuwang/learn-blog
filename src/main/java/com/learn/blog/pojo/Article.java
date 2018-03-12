package com.learn.blog.pojo;

import lombok.Data;
import lombok.ToString;

import java.util.Date;
@Data
@ToString
public class Article {
    private Integer articleId;

    private String articleStatus;

    private Date articleCreated;

    private String articleTitle;

    private Integer articleSummery;

    private String articleContent;

    private String articleHtmlcontent;

    private String articleUrl;

    private Integer articleReading;

    private Integer articleCommentscount;

    private Integer articleLikescount;

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public String getArticleStatus() {
        return articleStatus;
    }

    public void setArticleStatus(String articleStatus) {
        this.articleStatus = articleStatus == null ? null : articleStatus.trim();
    }

    public Date getArticleCreated() {
        return articleCreated;
    }

    public void setArticleCreated(Date articleCreated) {
        this.articleCreated = articleCreated;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle == null ? null : articleTitle.trim();
    }

    public Integer getArticleSummery() {
        return articleSummery;
    }

    public void setArticleSummery(Integer articleSummery) {
        this.articleSummery = articleSummery;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent == null ? null : articleContent.trim();
    }

    public String getArticleHtmlcontent() {
        return articleHtmlcontent;
    }

    public void setArticleHtmlcontent(String articleHtmlcontent) {
        this.articleHtmlcontent = articleHtmlcontent == null ? null : articleHtmlcontent.trim();
    }

    public String getArticleUrl() {
        return articleUrl;
    }

    public void setArticleUrl(String articleUrl) {
        this.articleUrl = articleUrl == null ? null : articleUrl.trim();
    }

    public Integer getArticleReading() {
        return articleReading;
    }

    public void setArticleReading(Integer articleReading) {
        this.articleReading = articleReading;
    }

    public Integer getArticleCommentscount() {
        return articleCommentscount;
    }

    public void setArticleCommentscount(Integer articleCommentscount) {
        this.articleCommentscount = articleCommentscount;
    }

    public Integer getArticleLikescount() {
        return articleLikescount;
    }

    public void setArticleLikescount(Integer articleLikescount) {
        this.articleLikescount = articleLikescount;
    }
}