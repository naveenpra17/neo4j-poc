package com.stackroute.service;

import com.stackroute.domain.Movie;

import java.util.List;

public interface MovieService {

    Movie getMovieById(int id);
    Movie saveMovie(Movie movie);
    List<Movie> getAllMovie();
    Movie deleteMovieById();
    Movie updateById();
}
