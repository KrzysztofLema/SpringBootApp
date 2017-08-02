package com.example.memy.controller;

import com.example.memy.ArticleDao.GifDaoImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by slickender on 02.08.2017.
 */
@Controller
public class GifController {
    @GetMapping("/")
    public String home(ModelMap modelMap){
        GifDaoImpl gifDaoImpl=new GifDaoImpl();
        modelMap.addAttribute("gifs", gifDaoImpl.allGifs());
        return "home";
    }
}
