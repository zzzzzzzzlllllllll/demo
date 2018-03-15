package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Description:测试
 *
 * @author Created by zhang.lei on 2018/3/12-17:33
 */
@Controller
public class HelloController {
    @RequestMapping(value = "hello")
    @ResponseBody
    public String hello(String name) {
        return "Hello " + name;
    }
}
