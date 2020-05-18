package com.example.application.service;

import com.example.application.model.Movie;
import com.example.application.repository.MovieRepository;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService implements IMovieService {

    @Autowired
    private MovieRepository repository;

    @Override
    public List<Movie> findAll() {

        List<Movie> movies = (List<Movie>) repository.findAll();

        return movies;
    }
    @Override
    public List<Movie> findByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public List<Movie> filterByRating(float belowRating, float aboveRating) {
        return repository.filterByRating(belowRating,aboveRating);
    }
}