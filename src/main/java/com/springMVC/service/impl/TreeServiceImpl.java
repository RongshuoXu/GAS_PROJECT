package com.springMVC.service.impl;

import com.springMVC.mapper.TreeMapper;
import com.springMVC.pojo.TreeInfo;
import com.springMVC.service.TreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("treeService")
public class TreeServiceImpl implements TreeService {
    @Autowired
    private TreeMapper treeMapper;
    @Override
    public List<TreeInfo> selectTree() {
        return this.treeMapper.selectTree();
    }
}
