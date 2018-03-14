package com.learn.blog.controller;

import com.learn.blog.pojo.Article;
import com.learn.blog.pojo.User;
import com.learn.blog.service.BlogService;
import com.learn.blog.service.UserService;
import com.learn.blog.until.ChkTools;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author Created by 一伞烟雨 on 2018/3/13.
 */
@Controller
@RequestMapping("/u")
public class UserSpaceController {
    private final static Logger LOGGER = LoggerFactory.getLogger(UserSpaceController.class);

    @Autowired
    private UserService userService;

    @Autowired
    private BlogService blogService;

    @GetMapping("/{username}")
    public String userSpace(@PathVariable("username")String username, Model model){
        User user = userService.selectByUsername(username);
        model.addAttribute("user",user);
        return "redirect:/u/"+username +"blogs";
    }

    @GetMapping("/{username}/blogs")
    public String listBlogsByOrder(@PathVariable(value = "username",required = false)String username,
                                   @RequestParam(value = "category",required = false)String category,
                                   @RequestParam(value = "order",required = false)String order,
                                   Model model){
        User user = userService.selectByUsername(username);

        if (ChkTools.isNotNull(category)){
            System.out.print("category:" +category );
            System.out.print("selflink:" + "redirect:/u/"+ username +"/blogs?category="+category);
            return "/u";
        }
        List<Article> blogs = null;
        if (order.equals("new")){ //最新查询
            blogs = blogService.getBlogsByUserId(user.getId());
        }
        if (order.equals("hot")){ //最热查询

        }
        model.addAttribute("order",order);
        model.addAttribute("blogList",blogs);
        return "/userspace/u";
    }

    /**
     * 获取博客的展示界面
     * @param username
     * @param id
     * @param model
     * @return
     */
    @GetMapping("/{username}/blogs/{id}")
    public String getBolgBuId(@PathVariable("username")String username, @PathVariable("id")Integer id,Model model){

        model.addAttribute("isBlogOwner",true);
        model.addAttribute("blogModel",blogService.getBlogById(id));
        return "/userspace/blog";
    }
}
