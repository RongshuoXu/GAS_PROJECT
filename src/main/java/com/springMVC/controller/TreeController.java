package com.springMVC.controller;

import com.springMVC.pojo.TreeInfo;
import com.springMVC.service.TreeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


@Controller
public class TreeController {
    @Resource
    private TreeService treeService;

    @RequestMapping(value="/showTree")
    public List<TreeInfo> showAddressTree(HttpServletRequest request, HttpServletResponse response) {
        List<TreeInfo> list = treeService.selectTree();
        System.out.println("list:"+list);
        return list;
    }
}
