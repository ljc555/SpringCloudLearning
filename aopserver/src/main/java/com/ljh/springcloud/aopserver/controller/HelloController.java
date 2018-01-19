package com.ljh.springcloud.aopserver.controller;

import com.ljh.springcloud.aopserver.annotation.RedisCache;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// 在浏览器中输入：http://localhost:8769/annotation
@RestController
public class HelloController {

    @RequestMapping(value = "/hello")
    public String hello(@RequestParam(value = "name", required = true) String name) {
        String result = "hello  " + name;
        System.out.println(result);
        return result;
    }

    @RequestMapping(value = "/world")
    public String world(@RequestParam(value = "arg", required = true) String arg) {
        String result = "world  " + arg;
        System.out.println(result);
        return result;
    }

    @RequestMapping(value = "/annotation")
    @RedisCache(type = String.class)
    public String annotation() {
        return "annotation";
    }
}