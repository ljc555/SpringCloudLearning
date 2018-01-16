package com.ljh.springcloud.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaClientController {
    @Value("${server.port}")
    String port;

    @RequestMapping("/")
    public String home() {
        return "hello,i am from port:" +port;
    }
}
