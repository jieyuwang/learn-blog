package com.learn.blog.service.impl;

import com.learn.blog.dao.UserMapper;
import com.learn.blog.pojo.User;
import com.learn.blog.pojo.UserExample;
import com.learn.blog.service.UserService;
import org.omg.PortableInterceptor.USER_EXCEPTION;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Created by 一伞烟雨 on 2018/3/8.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectList() {
        List<User> list = userMapper.selectByExample(null);
        return list;
    }

    @Override
    public User selectByUserId(Integer userId) {
        User user = userMapper.selectByPrimaryKey(userId);

        return user;
    }

    @Override
    public void saveUser(User user) {
        userMapper.insertSelective(user);
    }

    @Override
    public void deleteByUserId(Integer userId) {
        userMapper.deleteByPrimaryKey(userId);
    }

    @Override
    public void updateUser(User user){
        userMapper.updateByPrimaryKey(user);
    }

}
