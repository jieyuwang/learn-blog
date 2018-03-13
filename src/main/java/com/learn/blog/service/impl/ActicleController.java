package com.learn.blog.service.impl;

import com.learn.blog.dao.ArticleMapper;
import com.learn.blog.pojo.Article;
import com.learn.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author Created by 一伞烟雨 on 2018/3/13.
 */
public class ActicleController implements ArticleService{

    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public List<Article> selectAll() {
        List<Article> allArticle = articleMapper.selectByExample(null);
        return allArticle;
    }

    @Override
    public List<Article> selectByUserId(Integer userId) {
       /* ArticleExample articleExample = new ArticleExample();
        articleExample.*/
        List<Article> articeles = articleMapper.selectByUserId(userId);
        return articeles;
    }

    @Override
    public List<Article> selectByCategoryId() {
        return null;
    }

    @Override
    public void saveArticle(Article article) {

    }

    @Override
    public void updateArticle(Article article) {

    }

    @Override
    public void deleteArticle(Article article) {

    }
}
