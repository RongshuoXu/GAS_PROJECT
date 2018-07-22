package com.springMVC.controller;
import javax.servlet.http.HttpServletRequest;
import com.springMVC.pojo.GasAddressInfo;
import com.springMVC.pojo.TreeInfo;
import com.springMVC.pojo.User;
import com.springMVC.service.TreeService;
import com.springMVC.service.UserService;
import com.sun.istack.internal.logging.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    private static final Logger LOG = Logger.getLogger(UserController.class);
    @Resource
    private UserService userService;


    @RequestMapping("/test")
    public String xxx(){
        return "index";
    }

    @RequestMapping( method = RequestMethod.GET)
    @ResponseBody
    public List<User> selectAllUser(){
        List<User> users = new ArrayList<>();

        users = this.userService.selectAllUsers();

        return  users;
    }

    @RequestMapping(value="/gas-address/{user-card}" , method = RequestMethod.GET)
    @ResponseBody
    public List<GasAddressInfo> selectGasAdressInfoByUserCardNumber(@PathVariable("user-card") final String user_card){
        List<GasAddressInfo> gasAddressInfos = new ArrayList<>();


        System.out.println("USER_CARD IS " + user_card);

        gasAddressInfos = this.userService.selectUserGasAddressInfoByUserCard(user_card);

        return gasAddressInfos == null? null : gasAddressInfos;
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