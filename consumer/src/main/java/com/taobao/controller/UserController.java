package com.taobao.controller;

import com.taobao.entity.User;
import com.taobao.feign.UserFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserFeign userFeign;

    @GetMapping("/findAll")
    public List<User> findAll(){
        return userFeign.findAll();
    }

}
