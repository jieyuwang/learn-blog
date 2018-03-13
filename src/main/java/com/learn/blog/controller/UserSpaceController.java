package com.learn.blog.controller;

import com.learn.blog.pojo.User;
import com.learn.blog.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Created by 一伞烟雨 on 2018/3/13.
 */
@Controller
@RequestMapping("/u")
public class UserSpaceController {
    private final static Logger LOGGER = LoggerFactory.getLogger(UserSpaceController.class);

    @Autowired
    private UserService userService;

    @GetMapping("/{username}")
    public String userSpace(@PathVariable("username")String username, Model model){
        User user = userService.selectByUsername(username);
        model.addAttribute("user",user);
        return "redirect:/u/"+username +"blogs";
    }

    @GetMapping("/{username}/blogs")
    public String listBlogsByOrder(@PathVariable("username")String username, User user){

        return "";
    }

}
