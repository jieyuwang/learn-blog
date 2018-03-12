package com.learn.blog.controller;

import com.learn.blog.pojo.User;
import com.learn.blog.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author Created by 一伞烟雨 on 2018/3/12.
 */
@Controller
public class MainController {
    private final static Logger LOGGER = LoggerFactory.getLogger(MainController.class);
    @Autowired
    private UserService userService;

    /**
     * 首页设置
     * @return
     */
    @GetMapping({"/","/index"})
    public String index(){
        return "redirect:/index";
    }

    /**
     * 获取登录界面
     * @return
     */
    @GetMapping("/login")
    public String login(){
        return "login";
    }

    /**
     *  登录错误
     * @param model
     * @return
     */
    @GetMapping("/login-error")
    public String loginError(Model model){
        model.addAttribute("loginError", true);
        model.addAttribute("errorMsg", "登陆失败，账号或者密码错误！");
        return "login";
    }

    /**
     * 注册页面
     * @return
     */
    @GetMapping("/register")
    public String register(){
        return "register";
    }

    /**
     * 注册用户
     * @param user
     * @return
     */
    @PostMapping("/register")
    public String registerUser(User user){
        userService.saveUser(user);
        return "redirect:/login";
    }
}
