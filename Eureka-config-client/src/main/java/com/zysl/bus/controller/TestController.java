package com.zysl.bus.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class TestController {

    @Value("${name}")
    private String name;
    @Value("${application}")
    private String application;
    @Value("${port}")
    private String port;

    @RequestMapping("/getName")
    public String getName(){
        return "name:"+this.name+",application:"+this.application+",port:"+this.port;
    }
}
