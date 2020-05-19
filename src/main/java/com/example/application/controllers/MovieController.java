package com.example.application.controllers;

import java.util.List;
import com.example.application.service.ICastService;
import com.example.application.service.IMovieService;
import com.example.application.model.Cast;
import com.example.application.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
    @Autowired
    private IMovieService movieService;
    @Autowired
    private ICastService castService;

    @RequestMapping(value = "/showMovies")
    public List<Movie> getMovies() {
        return movieService.findAll();
    }

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public @ResponseBody List<Movie> getMovie(
            @RequestParam(name = "name", required = true, defaultValue = "name") String name) {
        List<Movie> movie = movieService.findByName(name);
        return movie;
    }

    @RequestMapping(value = "/filter", method = RequestMethod.GET)
    public @ResponseBody List<Movie> getFilteredMovies(
            @RequestParam(name = "below", required = true, defaultValue = "0.0") float belowRating,
            @RequestParam(name = "above", required = true, defaultValue = "10.0") float aboveRating) {
        return movieService.filterByRating(belowRating, aboveRating);
    }

    @RequestMapping(value = "/sort")
    public List<Movie> getSortedMovies() {
        return movieService.sortByRating();
    }

    @RequestMapping(value = "/list")
    public List<Movie> getListMovies() {
        return movieService.listMovies();
    }

    @RequestMapping(value = "/showcast", method = RequestMethod.GET)
    public @ResponseBody List<Cast> getListCasts(
            @RequestParam(name = "id", required = true) Long movie_id) {
        return castService.listCasts(movie_id);
    }
}
