package com.learn.blog.controller;

import com.learn.blog.pojo.User;
import com.learn.blog.service.UserService;
import com.learn.blog.until.ChkTools;
import com.learn.blog.until.Md5Util;
import com.learn.blog.vo.BaseResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.ConstraintViolationException;
import java.util.List;

/**
 * @author Created by 一伞烟雨 on 2018/3/6.
 */
@RestController
@RequestMapping("users")
public class UserController{
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    /**
     * 查询所有的用户
     * @param async
     * @param pageIndex
     * @param pageSize
     * @param name
     * @param model
     * @return
     */
    @GetMapping
    public ModelAndView usersList(@RequestParam(value = "async",required = false) boolean async,
                                  @RequestParam(value = "pageIndex",required = false,defaultValue ="0")int pageIndex,
                                  @RequestParam(value = "pageSize",required = false,defaultValue = "10")int pageSize,
                                  @RequestParam(value = "name",required = false,defaultValue = "")String name,Model model){
        List<User> usersList = userService.selectList();
        model.addAttribute("userList",usersList);
        return new ModelAndView("/user/list","userModel",model);
    }

    /**
     * 获取from 表单界面
     * @param model
     * @return
     */
    @GetMapping("/add")
    public ModelAndView createFrom(Model model){
        model.addAttribute("user",new User());
        return new ModelAndView("/user/add","userModel",model);
    }

    /**
     * 新建用户或者修改用户
     * @param user
     * @return
     */
    @PostMapping
    public BaseResponse createUser(User user){
        if (user.getId() == null){
            user.setPassword(Md5Util.md5(user.getPassword()));
            try {
                userService.saveUser(user);
            }  catch (ConstraintViolationException e)  {
                //throw new TotalException("保存用户错误");
                LOGGER.error("保存用户错误");
            }
        }else{
            try{
                User oldUser = userService.selectByUserId(user.getId());
                if (ChkTools.isNotNull(oldUser)){
                    boolean isTrue = Md5Util.md5(user.getPassword()).matches(oldUser.getPassword());
                    if (isTrue){
                        userService.updateUser(user);
                    }
                }else {
                    return BaseResponse.error(-1,"该用户不存在");
                }
            }catch(Exception e) {
                LOGGER.error("该数据在数据库中不存在");
            }
        }

        return BaseResponse.ok();
    }

    /**
     * 删除用户 通过id
     * @param userId
     * @param model
     * @return
     */
    @DeleteMapping("/{id}")
    public BaseResponse deleteUser(@PathVariable("id") Integer userId, Model model){
        userService.deleteByUserId(userId);
        return BaseResponse.ok();
    }

    /**
     * 获取修改页面的界面及数据
     * @param userId
     * @param model
     * @return
     */
    @GetMapping("/edit/{id}")
    public ModelAndView modifyFrom(@PathVariable("id")Integer userId, Model model){
        User user = userService.selectByUserId(userId);
        model.addAttribute("user",user);
        return new ModelAndView("/user/edit","userModel",model);
    }
}
