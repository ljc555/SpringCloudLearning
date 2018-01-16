package com.ljh.springcloud.userserver2.controller;

import com.ljh.springcloud.data.UserData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户管理
 */
@RequestMapping(value="/user")
@RestController
public class UserController {

    @RequestMapping(value="/{uid}",method = RequestMethod.GET)
    public UserData getUser(@PathVariable final String uid) {
        UserData user = new UserData();
        user.setUid("01");
        user.setAge("28");
        user.setMobile("13759449322");
        user.setName("李节参");
        user.setSex(Boolean.TRUE);
        user.setServer("userserver2");
        return user;
    }
}
