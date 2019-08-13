package com.stackroute.service;

import com.stackroute.domain.Movie;
import com.stackroute.repository.MoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MovieServiceImpl implements MovieService {
    private MoviesRepository moviesRepository;

    @Autowired
    public MovieServiceImpl(MoviesRepository moviesRepository) {
        this.moviesRepository = moviesRepository;
    }

    @Override
    public Movie getMovieById(int id) {
        return moviesRepository.findById(id).get();
    }

    @Override
    public Movie saveMovie(Movie movie) {
        return null;
    }

    @Override
    public List<Movie> getAllMovie() {
        return null;
    }

    @Override
    public Movie deleteMovieById() {
        return null;
    }

    @Override
    public Movie updateById() {
        return null;
    }
}
