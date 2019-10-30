package com.lwj.ggmall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @RequestMapping("index")
    public String index(){
        return "welcome";

    }
}
