package com.learn.blog.service;

import com.learn.blog.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Created by 一伞烟雨 on 2018/3/13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserServiceTest {
    @Autowired
    UserService userService;
    @Test
    public void selectByUsername() throws Exception {
        User user = userService.selectByUsername("2341");
        System.out.println(user.getId());

    }

}