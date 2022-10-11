package com.example.demo.Controller;

import com.example.demo.model.SysAdminUser;
import com.example.demo.service.SysAdminUserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    SysAdminUserService sysAdminUserService;

    /* 方法注解 */
    @ApiOperation(value = "方法名:用户列表", notes = "获取用户列表")
    @GetMapping("/list")
    public List<SysAdminUser> list(){
        List<SysAdminUser> list = sysAdminUserService.findAll();

        return list;
    }

}