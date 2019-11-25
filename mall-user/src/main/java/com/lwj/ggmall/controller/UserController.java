package com.lwj.ggmall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class UserController {

    @RequestMapping("index")
    public String index(){
        return "welcome";

    }

    @RequestMapping("index2")
    public String index2(){
        return "welcome2";

    }


}
