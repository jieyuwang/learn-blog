package com.learn.blog.service;

import com.learn.blog.pojo.Article;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author Created by 一伞烟雨 on 2018/3/14.
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class BlogServiceTest {

    @Autowired
    private BlogService blogService;

    @Test
    public void getBlogsByUser() throws Exception {
        List<Article> blogs = blogService.getBlogsByUserId(1);
        System.out.println("testblogs"+blogs.toString());
    }

}