package com.example.memy.controller;

import com.example.memy.ArticleDao.CategoryDaoImpl;
import com.example.memy.Model.Category;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by slickender on 02.08.2017.
 */
@Controller
public class CategoryController {

    @GetMapping("/categories")
    public String article(ModelMap modelMap){
        CategoryDaoImpl categoryDao= new CategoryDaoImpl();
        modelMap.addAttribute("categories", categoryDao.findAll());
        return "categories";
    }
}
