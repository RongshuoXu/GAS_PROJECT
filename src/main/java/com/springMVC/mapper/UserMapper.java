package com.springMVC.mapper;


import com.springMVC.pojo.User;

public interface UserMapper {

    User selectUser(String userName);
}
