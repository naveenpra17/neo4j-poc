package com.stackroute.controller;

import com.stackroute.domain.Critic;
import com.stackroute.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Collections;

@RestController
@RequestMapping(value = "api/v1/")
public class CriticController {
    private MovieService movieService;
    @Autowired
    private CriticController(MovieService movieService){
        this.movieService=movieService;
    }
    @GetMapping
    public Collection<Critic>

}
