package com.springMVC.service.impl;

import com.springMVC.mapper.UserMapper;
import com.springMVC.pojo.User;
import com.springMVC.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public User selectUser(String userName) {
        return this.userMapper.selectUser(userName);
    }
}

