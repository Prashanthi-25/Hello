package com.example.application.service;

import com.example.application.model.Movie;

import java.util.List;

public interface IMovieService {

    List<Movie> findAll();
}