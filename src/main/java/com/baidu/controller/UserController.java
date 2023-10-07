package com.baidu.controller;

import com.baidu.pojo.User;
import com.baidu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//控制层
//@RestController =@Controller+@ResponseBody(使返回的是数据)
@CrossOrigin //vue前后端分离 解决端口号不一致问题 跨域
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    //登录 post请求
    @PostMapping("login")
    public String login(@RequestBody User user) {
         User u= userService.login(user);
        if(u!=null){
            return "ok";
        }
        return "no";
    }

}
