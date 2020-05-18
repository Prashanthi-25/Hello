package com.example.application.controllers;

import java.util.List;
import com.example.application.service.IMovieService;
import com.example.application.repository.*;
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
    // private MovieRepository movieRepository;
        @RequestMapping(value = "/showMovies")
public List<Movie> getMovies() {
return movieService.findAll();
}
// @Autowired
// @RequestMapping(value="/search", method = RequestMethod.GET)
// public @ResponseBody List<Movie> getMovie(@RequestParam(name="name", required = false, defaultValue = "name") String name) {
//     return movieService.findByName(name);
// }
@RequestMapping(value="/search", method = RequestMethod.GET)
public @ResponseBody List<Movie> getMovie(@RequestParam(name="name", required = true, defaultValue = "name") String name) {
 List<Movie> movie = movieService.findByName(name);
 return movie;
}
}


