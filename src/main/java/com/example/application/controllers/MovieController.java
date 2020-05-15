package com.example.application.controllers;

import java.util.List;

import com.example.application.model.Movie;
import com.example.application.service.IMovieService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MovieController {

    @Autowired
    private IMovieService movieService;

    // @GetMapping(value= "/showMovies")
    // public String findMovies(Model model) {

    //     List<Movie> movies = (List<Movie>) movieService.findAll();

        //model.addAttribute("movies", movies);

        //return "index";
        @GetMapping(value = "/showMovies")
public List<Movie> getMovies() {
return movieService.findAll();
}
    }
