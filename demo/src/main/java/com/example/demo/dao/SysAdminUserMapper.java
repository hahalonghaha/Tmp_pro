package com.example.demo.dao;

import com.example.demo.model.SysAdminUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface SysAdminUserMapper {
    // 获取用户列表
    List<SysAdminUser> selectAll();


}