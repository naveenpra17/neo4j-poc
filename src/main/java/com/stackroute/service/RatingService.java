package com.stackroute.service;

import com.stackroute.domain.Critic;
import com.stackroute.domain.Movie;

import java.util.Collection;

public interface RatingService {
    Critic getCriticById(long id);

    Critic saveCritic(Critic movie);

    Collection<Critic> getAllCritic();

    Critic deleteCriticById(long id);

    Critic updateCriticById(Critic movie);

    Movie getMovieById(long id);

    Movie saveMovie(Movie movie);

    Iterable<Movie> getAllMovie();

    Movie deleteMovieById(long id);

    Movie updateMovieById(Movie movie);
}

