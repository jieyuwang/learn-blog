package com.learn.blog.service.impl;

import com.learn.blog.dao.ArticleMapper;
import com.learn.blog.pojo.Article;
import com.learn.blog.pojo.User;
import com.learn.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Created by 一伞烟雨 on 2018/3/14.
 */
@Service
public class BlogServiceImpl implements BlogService{
    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public Article getBlogById(Integer id) {
        Article article = articleMapper.selectByPrimaryKey(id);
        return article;
    }

    /**
     * 根据用户id 查新所有的博文
     *
     * @param user_id
     */
    @Override
    public List<Article> getBlogsByUserId(Integer user_id) {
        List<Article> blogs = articleMapper.selectByUserId(user_id);
        return blogs;
    }
}
