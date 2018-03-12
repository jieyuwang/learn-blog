package com.learn.blog.controller;

import com.learn.blog.pojo.User;
import com.learn.blog.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Created by 一伞烟雨 on 2018/3/12.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserControllerTest {
    @Autowired
    UserService userService;
    @Test
    public void modifyFrom() throws Exception {
        User user = userService.selectByUserId(2);
        System.out.println(user);
    }
    @Test
    public void createUser(){



        UserController userController = new UserController();

//        User user=new User();
//        user.setId(11);user.setName("11");user.setName("11");user.setPassword("11");user.setUsername("11");user.setEmail("23");
//        userController.createUser(user);
        userController.createUser(new User(2,"11","11","11","11"));
        userController.createUser(new User(null,"11","11","11","11"));

    }

}