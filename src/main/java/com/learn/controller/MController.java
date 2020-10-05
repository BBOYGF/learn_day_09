package com.learn.controller;

import com.learn.exception.exception;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
@RequestMapping("/test")
public class MController {
    @RequestMapping("/demo")
    public String test() throws exception {
        try {
            int a = 10 / 0;
        }catch(Exception e){
            e.printStackTrace();
            throw new exception("错误提示：太饿了");
        }
        return "test";
    }
}
