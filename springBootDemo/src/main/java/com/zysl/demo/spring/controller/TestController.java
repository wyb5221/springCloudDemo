package com.zysl.demo.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("testHello")
    public String index(@RequestParam String name){
        System.out.println("lalala");
        return "Hello:"+name;
    }
}
