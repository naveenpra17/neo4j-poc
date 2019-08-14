package com.stackroute.controller;

import com.stackroute.domain.Critic;
import com.stackroute.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping(value = "api/v1")
public class CriticController {
    private RatingService ratingService;
    @Autowired
    private CriticController(RatingService ratingService){
        this.ratingService = ratingService;
    }
    @GetMapping
    public Collection<Critic> getAllCritic(){
        return ratingService.getAllCritic();
    }

}
