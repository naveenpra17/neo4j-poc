package com.stackroute.service;

import com.stackroute.domain.Critic;
import com.stackroute.domain.Movie;
import com.stackroute.repository.CriticRepository;
import com.stackroute.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class RatingServiceImpl implements RatingService {
    private CriticRepository criticRepository;
    private MovieRepository movieRepository;

    @Autowired
    public RatingServiceImpl(CriticRepository criticRepository, MovieRepository movieRepository) {
        this.criticRepository = criticRepository;
        this.movieRepository = movieRepository;
    }

    @Override
    public Critic getCriticById(long id) {
        return criticRepository.findById(id).get();
    }

    @Override
    public Critic saveCritic(Critic critic) {
        System.out.println(critic);
        return criticRepository.save(critic);
    }

    @Override
    public Collection<Critic> getAllCritic() {
        return criticRepository.getAllCritic();
    }

    @Override
    public Critic deleteCriticById(long id) {
        Optional<Critic> optionalMovie = criticRepository.findById(id);
        criticRepository.deleteById(id);
        return optionalMovie.get();
    }

    @Override
    public Critic updateCriticById(Critic critic) {
        criticRepository.deleteById(critic.getId());
        return criticRepository.save(critic);
    }
@Override
    public Movie getMovieById(long id) {
        return movieRepository.findById(id).get();
    }
@Override
    public Movie saveMovie(Movie movie) {
        return movieRepository.save(movie);
    }

@Override
    public Iterable<Movie> getAllMovie() {
        return movieRepository.findAll();
    }

    public Movie deleteMovieById(long id) {
        Optional<Movie> optionalMovie = movieRepository.findById(id);
        movieRepository.deleteById(id);
        return optionalMovie.get();
    }

    public Movie updateMovieById(Movie movie) {
        movieRepository.deleteById(movie.getId());
        return movieRepository.save(movie);
    }
}
