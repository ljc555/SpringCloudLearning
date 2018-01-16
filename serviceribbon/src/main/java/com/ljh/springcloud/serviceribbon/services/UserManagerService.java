package com.ljh.springcloud.serviceribbon.services;

import com.ljh.springcloud.data.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserManagerService {
    @Autowired
    RestTemplate restTemplate;

    public UserData getUser(String uid) {
        return restTemplate.getForObject("http://USERSERVER/user/"+uid,UserData.class);
    }
}
