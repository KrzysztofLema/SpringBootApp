package com.example.memy.ArticleDao;

import com.example.memy.Model.Gif;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by slickender on 02.08.2017.
 */
public class GifDaoImpl implements GifDao {

    private static List<Gif> gifList = new ArrayList<>();


    static {
        gifList.add(new Gif("android-explosion", true,"asdf"));
        gifList.add(new Gif("ben-and-mike", false,"zxcasd"));
        gifList.add(new Gif("book-dominos", false,"zxasdqwe"));
        gifList.add(new Gif("compiler-bot", true,"iwjeoij"));
        gifList.add(new Gif("cowboy-coder", false,"j cljjnadl"));
        gifList.add(new Gif("infinite-andrew", false,"pqoowejj"));

    }


    public List<Gif> allGifs() {
        return gifList;
    }

    @Override
    public List<Gif> findFavourites() {
        List<Gif> favouritesGifs = new ArrayList<>();
        for (int i = 0; i < gifList.size(); i++) {
            if (gifList.get(i).getFavorite() == true) {
                favouritesGifs.add(gifList.get(i));
            }

        }
        return favouritesGifs;
    }

    @Override
    public List<Gif> findByName(String name) {
        List<Gif> result = new ArrayList<>();
        for (Gif gif : gifList) {
            if (gif.getName().equals(name)) {
                result.add(gif);
            }
        }
        return result;
    }





}

