package com.ljh.springcloud.userserver1.controller;

import com.ljh.springcloud.data.UserData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户管理
 */
@RequestMapping(value="/user")
@RestController
public class UserController {

    @GetMapping(value="/{uid}")
    public UserData getUser(@PathVariable final String uid) {
        UserData user = new UserData();
        user.setUid("01");
        user.setAge("28");
        user.setMobile("13759449322");
        user.setName("李节参");
        user.setSex(Boolean.TRUE);
        user.setServer("userserver1");
        return user;
    }
}
