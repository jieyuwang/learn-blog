package com.learn.blog.pojo;

public class Article {
    private Integer id;

    private String title;

    private Integer summery;

    private String content;

    private String htmlcontent;

    private String readsize;

    private Integer commentsize;

    private Integer likesize;

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
        this.title = title == null ? null : title.trim();
    }

    public Integer getSummery() {
        return summery;
    }

    public void setSummery(Integer summery) {
        this.summery = summery;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getHtmlcontent() {
        return htmlcontent;
    }

    public void setHtmlcontent(String htmlcontent) {
        this.htmlcontent = htmlcontent == null ? null : htmlcontent.trim();
    }

    public String getReadsize() {
        return readsize;
    }

    public void setReadsize(String readsize) {
        this.readsize = readsize == null ? null : readsize.trim();
    }

    public Integer getCommentsize() {
        return commentsize;
    }

    public void setCommentsize(Integer commentsize) {
        this.commentsize = commentsize;
    }

    public Integer getLikesize() {
        return likesize;
    }

    public void setLikesize(Integer likesize) {
        this.likesize = likesize;
    }
}