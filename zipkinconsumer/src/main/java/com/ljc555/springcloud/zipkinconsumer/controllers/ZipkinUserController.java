package com.ljc555.springcloud.zipkinconsumer.controllers;

import com.ljh.springcloud.data.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 用户管理
 */
@RequestMapping(value="/user")
@RestController
public class ZipkinUserController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value="/{uid}")
    public UserData getUser(@PathVariable final String uid) {
        UserData user = new UserData();
        user.setUid("01");
        user.setAge("28");
        user.setMobile("13759449322");
        user.setName("李节参");
        user.setSex(Boolean.TRUE);
        user.setServer("zipkinconsumer");
        return user;
    }

    @GetMapping(value="/consumer")
    public UserData provder(@PathVariable final String uid) {
        return restTemplate.getForObject("http://localhost:8988/user/01",UserData.class);
    }
}
