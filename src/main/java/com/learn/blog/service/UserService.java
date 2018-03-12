package com.learn.blog.service;

import com.learn.blog.pojo.User;

import java.util.List;

/**
 * @author Created by 一伞烟雨 on 2018/3/8.
 */
public interface UserService {
    /**
     *  查询所有的用户列表
     */
    List<User> selectList();

    /**
     * 按照主键id 查询用户
     * @param userId
     * @return
     */
    User selectByUserId(Integer userId);

    /**
     * 保存用户
     * @param user
     */
    void saveUser(User user);

    /**
     * 删除用户 根据用户id
     * @param userId
     */
    void deleteByUserId(Integer userId);

    /**
     * 更新用户信息
     * @param user
     */
    void updateUser(User user);

}
