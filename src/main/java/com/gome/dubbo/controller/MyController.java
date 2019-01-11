package com.gome.dubbo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
    @RequestMapping(value = "/test")
    public String index(){
        System.out.println("Just for you");
        System.out.println("the fro your tormoor");
        System.out.println("fory ou me to and ");
        System.out.println("just for you and me ");
        return "for you and me index";
    }
}
