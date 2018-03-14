package com.learn.blog.service;

import com.learn.blog.pojo.Article;

import java.util.List;

/**
 * @author Created by 一伞烟雨 on 2018/3/14.
 */
public interface BlogService {

    /**
     * 根据文章id查询博文
     * @param id
     * @return
     */
    Article getBlogById(Integer id);

    /**
     * 根据用户id 查新所有的博文
     */
    List<Article> getBlogsByUserId(Integer user_id);
}
