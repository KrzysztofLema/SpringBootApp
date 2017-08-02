package com.example.memy.ArticleDao;

import com.example.memy.Model.Category;

import java.util.List;

/**
 * Created by slickender on 02.08.2017.
 */
public interface CategoryDao {
    List<Category> findAll();
}
