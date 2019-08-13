package com.stackroute.service;

import com.stackroute.domain.Critic;
import com.stackroute.repository.MoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class CriticServiceImpl implements CriticService {
    private MoviesRepository moviesRepository;

    @Autowired
    public CriticServiceImpl(MoviesRepository moviesRepository) {
        this.moviesRepository = moviesRepository;
    }

    @Override
    public Critic getMovieById(int id) {
        return moviesRepository.findById(id).get();
    }

    @Override
    public Critic saveMovie(Critic critic) {
        return moviesRepository.save(movie);
    }

    @Override
    public Iterable<Critic> getAllMovie() {
        return moviesRepository.findAll();
    }

    @Override
    public Critic deleteMovieById(int id) {
        Optional<Critic> optionalMovie = moviesRepository.findById(id);
        moviesRepository.deleteById(id);
        return optionalMovie.get();
    }

    @Override
    public Critic updateById(Critic critic) {
        moviesRepository.deleteById(critic.getId());
        return moviesRepository.save(critic);
    }
}
