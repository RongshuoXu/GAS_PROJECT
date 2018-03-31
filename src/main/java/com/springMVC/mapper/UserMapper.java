package com.springMVC.mapper;


import com.springMVC.pojo.User;

import java.util.List;

public interface UserMapper {

    User selectUser(String userName);

    List<User> selectAllUser();
}
