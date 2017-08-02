package com.example.memy.ArticleDao;

import com.example.memy.Model.Category;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by slickender on 02.08.2017.
 */
public class CategoryDaoImpl {
    private static List<Category> categoryList = new ArrayList<>();

    static {
        categoryList.add(new Category(1L,"Painted"));
        categoryList.add(new Category(2L,"Realistic"));
        categoryList.add(new Category(3L, "Terrible"));
    }
    
    public List<Category> findAll(){
        return categoryList;
    }
}
