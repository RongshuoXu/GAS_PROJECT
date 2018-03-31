package com.springMVC.mapper;


import com.springMVC.pojo.GasAddressInfo;
import com.springMVC.pojo.User;

import java.util.List;

public interface UserMapper {

    User selectUser(String userName);

    List<User> selectAllUser();

    /*查询该用户下的所有燃气账号的信息*/
    List<GasAddressInfo> selectUserGasAddressInfoByUserCardNumber(final String user_ID_card);
}
