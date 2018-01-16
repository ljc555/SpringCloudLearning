package com.ljh.springcloud.servicehystrix.services;

import com.ljh.springcloud.data.UserData;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserManagerService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "getUserError")
    public UserData getUser(String uid) {
        return restTemplate.getForObject("http://USERSERVER/user/"+uid,UserData.class);
    }


    public UserData getUserError(String uid) {
        UserData user = new UserData();
        user.setUid("02");
        user.setAge("28");
        user.setMobile("13759449322");
        user.setName("李节参");
        user.setSex(Boolean.TRUE);
        user.setServer("断路器-服务器异常");
        return user;
    }
}
