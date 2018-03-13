package com.learn.blog.service;

import com.learn.blog.pojo.Article;

import java.util.List;

/**
 * @author Created by 一伞烟雨 on 2018/3/13.
 * 管理博文
 */
public interface ArticleService {

    /**
     * 查询所有的文章
     * @return
     */
    List<Article> selectAll();

    /**
     * 通过用户id查询文章
     * @return
     */
    List<Article> selectByUserId(Integer userId);

    /**
     * 通过分类查询文章
     * @return
     */
    List<Article> selectByCategoryId();

    /**
     * 保存文章
     * @param article
     */
    void saveArticle(Article article);

    /**
     * 更新文章
     * @param article
     */
    void updateArticle(Article article);

    /**
     * 根据文章id删除文章
     * @param article
     */
    void deleteArticle(Article article);
}
