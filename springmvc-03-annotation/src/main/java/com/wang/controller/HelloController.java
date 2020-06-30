package com.wang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String hello(Model model) {
        String result = "Hello SpringMVC Annotation";
        model.addAttribute("msg",result);
        return "hello";
    }
}
