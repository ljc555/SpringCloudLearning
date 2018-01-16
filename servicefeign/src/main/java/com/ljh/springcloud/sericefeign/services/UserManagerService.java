package com.ljh.springcloud.sericefeign.services;

import com.ljh.springcloud.data.UserData;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "USERSERVER")
public interface UserManagerService {

    @RequestMapping(value = "/user/{uid}",method = RequestMethod.GET)
    UserData getUser(@RequestParam(value = "uid") String uid);
}