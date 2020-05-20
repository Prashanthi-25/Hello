package com.example.application.service;
import com.example.application.model.Movie;
import java.util.List;

public interface IMovieService {

    List<Movie> findByName(String name);
    List<Movie> filterByRating(float belowRating, float aboveRating);
    List<Movie> sortBy();
}