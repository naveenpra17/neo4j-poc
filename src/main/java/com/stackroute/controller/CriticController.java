package com.stackroute.controller;

import com.stackroute.domain.Critic;
import com.stackroute.domain.Movie;
import com.stackroute.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping(value = "api/v1")
public class CriticController {
    private RatingService ratingService;

    @Autowired
    private CriticController(RatingService ratingService) {
        this.ratingService = ratingService;
    }

    @GetMapping(value = "/critics")
    public Collection<Critic> getAllCritic() {
        return ratingService.getAllCritic();
    }

    @PostMapping(value = "/critic")
    public Critic saveCritic(@RequestBody Critic critic) {
        System.out.println("****" + critic);
        return ratingService.saveCritic(critic);
    }
    @PostMapping(value = "/critic")
    public Critic updateCritic(@RequestBody Critic critic) {
        System.out.println("****" + critic);
        return ratingService.updateCriticById(critic);
    }
    @PostMapping(value = "/critic")
    public Movie updateMovie(@RequestBody Movie movie) {
        System.out.println("****" +  movie);
        return ratingService.updateMovieById(movie);
    }

    @PostMapping(value = "/movie")
    public Movie saveMovie(@RequestBody Movie movie) {
        System.out.println("****" + movie);
        return ratingService.saveMovie(movie);
    }

    @GetMapping(value = "/movies")
    public Iterable<Movie> getAllMovie() {
        return ratingService.getAllMovie();
    }


}
