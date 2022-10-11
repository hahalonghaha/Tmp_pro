package com.example.demo.service;

import com.example.demo.dao.SysAdminUserMapper;
import com.example.demo.model.SysAdminUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysAdminUserService {

    @Autowired
    SysAdminUserMapper sysAdminUserMapper;

    // 获取用户列表
    public List<SysAdminUser> findAll(){
        return sysAdminUserMapper.selectAll();
    }

}