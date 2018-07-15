package com.springMVC.service;

import com.springMVC.pojo.GasAddressInfo;
import com.springMVC.pojo.User;

import java.util.List;

public interface UserService {

    User selectUser(String userName);

    List<User> selectAllUsers();
//  查询某个用户下的所有燃气卡号
    List<GasAddressInfo> selectUserGasAddressInfoByUserCard(final String user_ID_card);

//    用户注册功能
    String registerUser(final User user, final GasAddressInfo gasAddressInfo);

}