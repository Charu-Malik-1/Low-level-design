package com.example.demo.book_my_show;

import lombok.Data;

import java.util.*;

@Data
public class Catalog implements Search{
    Map<String, List<Movie>> movieTitles;
    Map<String,List<Movie>> movieLanguage;

    public Catalog(){
        movieTitles=new HashMap<>();
        movieLanguage=new HashMap<>();
    }

    public void addMovie(Movie movie){

        if(!movieTitles.containsKey(movie.getTitle())){
            List<Movie> movies=new ArrayList<>();
            movies.add(movie);
            movieTitles.put(movie.getTitle(),movies);
        }else{
            List<Movie> movies=movieTitles.get(movie.getTitle());
            movies.add(movie);
            movieTitles.put(movie.getTitle(),movies);
        }

        if(!movieLanguage.containsKey(movie.getLanguage())){
            List<Movie> movies=new ArrayList<>();
            movies.add(movie);
            movieTitles.put(movie.getLanguage(),movies);
        }else{
            List<Movie> movies=movieTitles.get(movie.getLanguage());
            movies.add(movie);
            movieTitles.put(movie.getTitle(),movies);
        }
    }

    @Override
    public List<Movie> searchByTitle(String title){
        if(movieTitles.containsKey(title))
            return movieTitles.get(title);
        return null;
    }
}
