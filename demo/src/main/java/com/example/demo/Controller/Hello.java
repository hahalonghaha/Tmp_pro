package com.example.demo.Controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/system/user")
public class Hello {

    /* 方法注解 */
    @ApiOperation(value = "方法名:打招呼", notes = "打招呼方法的测试")
    @GetMapping("/hello")
    public String sayHello(/* 参数注解 */ @ApiParam(value = "参数:名字" , required=true ) @RequestParam String name){
        return "hi"+name+" ,I can say hello";
    }
}
