package com.springMVC.service.impl;

import com.springMVC.mapper.UserMapper;
import com.springMVC.pojo.GasAddressInfo;
import com.springMVC.pojo.User;
import com.springMVC.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public User selectUser(String userName) {
        return this.userMapper.selectUser(userName);
    }


    public List<User> selectAllUsers() {
        return this.userMapper.selectAllUser();
    }

    @Override
    public List<GasAddressInfo> selectUserGasAddressInfoByUserCard(String user_ID_card) {
        return this.userMapper.selectUserGasAddressInfoByUserCardNumber(user_ID_card);
    }

}

