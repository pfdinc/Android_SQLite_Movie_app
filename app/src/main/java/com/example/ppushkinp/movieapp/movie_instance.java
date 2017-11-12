package com.example.ppushkinp.movieapp;

/**
 * Created by Pushkin Feleke on 11/6/17.
 */

import java.io.Serializable;



public class movie_instance implements Serializable
{
    public String id;
    public String name;
    public String genre;
    public String price;

    public movie_instance(String id, String name, String genre, String price)
    {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.price = price;
    }
}
