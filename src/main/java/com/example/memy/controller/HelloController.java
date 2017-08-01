package com.example.memy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by slickender on 01.08.2017.
 */
@Controller
public class HelloController {
    @GetMapping("/")
    public String hello(ModelMap modelMap){
        modelMap.addAttribute("hello", "Krzysiek");
        return "hello";
    }
}
