package com.example.memy.Model;

import java.awt.*;

/**
 * Created by slickender on 02.08.2017.
 */
public class Gif {
    private String name;
    private boolean isFavourite;

    public Gif() {
    }

    public Gif(String name, boolean isFavourite) {
        this.name = name;
        this.isFavourite = isFavourite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFavourite() {
        return isFavourite;
    }

    public void setFavourite(boolean favourite) {
        isFavourite = favourite;
    }
}
