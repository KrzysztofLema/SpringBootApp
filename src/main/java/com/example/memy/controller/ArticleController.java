package com.example.memy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by slickender on 02.08.2017.
 */
@Controller
public class ArticleController {
    @GetMapping("/article")
    public String hello(ModelMap modelMap){
        modelMap.addAttribute("header", "My articles");
        return "articles";
    }
}
