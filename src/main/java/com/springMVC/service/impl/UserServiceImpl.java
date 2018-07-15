package com.springMVC.service.impl;

import com.springMVC.mapper.UserMapper;
import com.springMVC.pojo.GasAddressInfo;
import com.springMVC.pojo.User;
import com.springMVC.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Override
    public String registerUser(User user, GasAddressInfo gasAddressInfo) {
        return null;
    }

//    @Transactional("transactionManager")
//    @Override
//    public String registerUser(User user, GasAddressInfo gasAddressInfo) {
//
//        try{
//            int i = this.userMapper.registerUser(user);
//            int j = this.userMapper.registerUserGas(gasAddressInfo);
//        }catch (Exception e) {
//
//        }
//
//
//        return null;
//    }

}

