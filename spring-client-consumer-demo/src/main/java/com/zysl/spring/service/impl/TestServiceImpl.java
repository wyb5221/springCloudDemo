package com.zysl.spring.service.impl;

import com.zysl.spring.service.TestService;
import org.springframework.stereotype.Component;

@Component
public class TestServiceImpl implements TestService {

    @Override
    public String index(String name) {
        return "Oh! Error!!!" + name;
    }
}
