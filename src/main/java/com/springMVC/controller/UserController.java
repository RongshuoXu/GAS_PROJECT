package com.springMVC.controller;
import javax.servlet.http.HttpServletRequest;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.springMVC.pojo.User;
import com.springMVC.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;


    @RequestMapping("/test")
    public String xxx(){
        return "index";
    }

    @RequestMapping("/showUser")
    public String selectUser(HttpServletRequest request, Model model) throws IOException {
        request.setCharacterEncoding("UTF-8");
        String user_name = request.getParameter("name");

        System.out.println(user_name+"用户名参数是");

        User user = this.userService.selectUser(user_name);
        model.addAttribute("user",user);

        System.out.println(user);
        return "index";
    }
}