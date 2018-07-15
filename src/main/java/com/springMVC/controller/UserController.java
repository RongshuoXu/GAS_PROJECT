package com.springMVC.controller;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;


import com.springMVC.pojo.GasAddressInfo;
import com.springMVC.pojo.User;
import com.springMVC.service.UserService;
import com.sun.istack.internal.logging.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

@Controller
@RequestMapping("/user")
public class UserController {

    private static final Logger LOG = Logger.getLogger(UserController.class);
    @Resource
    private UserService userService;


    @RequestMapping( method = RequestMethod.GET)
    @ResponseBody
    public List<User> selectAllUser(){
        List<User> users = new ArrayList<>();

        users = this.userService.selectAllUsers();

        return  users;
    }



//    @RequestMapping("/register")
//    @ResponseBody
//    public String registerUser(@RequestParam("user_ID_card")String user_ID_card,
//                               @RequestParam("user_password")String user_password,
//                               @RequestParam("user_name")String user_name,
//                               @RequestParam("user_gas_card_number")String user_gas_card_number){
//
//        User user = new User();
//        user.setUser_ID_card(user_ID_card);
//        user.setUser_name(user_name);
//        user.setUser_password(user_password);
//        user.setUser_balance(0.00);
//
//        GasAddressInfo gasAddressInfo = new GasAddressInfo();
//        gasAddressInfo.setUser_ID_card(user_ID_card);
//        gasAddressInfo.setUser_gas_card_number(user_gas_card_number);
//
//        String result = this.userService.registerUser(user,gasAddressInfo);
//
//        return result;
//    }


    @RequestMapping(value="/gas-address/{user-card}" , method = RequestMethod.GET)
    @ResponseBody
    public List<GasAddressInfo> selectGasAdressInfoByUserCardNumber(@PathVariable("user-card") final String user_card){
        List<GasAddressInfo> gasAddressInfos = new ArrayList<>();


        System.out.println("USER_CARD IS " + user_card);

        gasAddressInfos = this.userService.selectUserGasAddressInfoByUserCard(user_card);

        return gasAddressInfos == null ? null : gasAddressInfos;
    }

}