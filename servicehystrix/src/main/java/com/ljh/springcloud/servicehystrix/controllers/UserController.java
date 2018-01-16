package com.ljh.springcloud.servicehystrix.controllers;

import com.ljh.springcloud.data.UserData;
import com.ljh.springcloud.servicehystrix.services.UserManagerService;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    UserManagerService userManagerService;

    @GetMapping(value="/{uid}")
    public UserData getUser(@PathVariable final String uid) {
        return userManagerService.getUser(uid);
    }
}
