package com.learn.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Created by 一伞烟雨 on 2018/3/5.
 */
@Controller
public class IndexController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){

        return "Hello World!";
    }
    @RequestMapping("/testindex")
    public String index(){
        return "index";
    }
}
