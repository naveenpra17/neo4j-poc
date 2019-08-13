package com.stackroute.service;

import com.stackroute.domain.Critic;

public interface CriticService {

    Critic getMovieById(int id);
    Critic saveMovie(Critic movie);
    Iterable<Critic> getAllMovie();
    Critic deleteMovieById(int id);
    Critic updateById(Critic movie);
}
