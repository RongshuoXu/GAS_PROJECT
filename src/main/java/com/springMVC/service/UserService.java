package com.springMVC.service;

import com.springMVC.pojo.User;

import java.util.List;

public interface UserService {

    User selectUser(String userName);

    List<User> selectAllUsers();

}