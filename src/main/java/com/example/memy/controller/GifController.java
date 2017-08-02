package com.example.memy.controller;

import com.example.memy.ArticleDao.GifDaoImpl;
import com.example.memy.Model.Gif;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

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
    @GetMapping("/gif/{name}")
    public String display(@PathVariable String name, @ModelAttribute Gif gif, ModelMap modelMap){
        GifDaoImpl gifDaoImpl=new GifDaoImpl();
        modelMap.addAttribute("allgifs",gifDaoImpl.allGifs());
        return ("gif-details");
    }
}
