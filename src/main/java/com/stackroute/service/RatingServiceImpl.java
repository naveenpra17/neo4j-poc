package com.stackroute.service;

import com.stackroute.domain.Critic;
import com.stackroute.domain.Movie;
import com.stackroute.repository.CriticRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;
@Service
public class RatingServiceImpl implements RatingService {
    private CriticRepository criticRepository;

    @Autowired
    public RatingServiceImpl(CriticRepository criticRepository) {
        this.criticRepository = criticRepository;
    }

    @Override
    public Critic getCriticById(long id) {
        return criticRepository.findById(id).get();
    }

    @Override
    public Critic saveCritic(Critic critic) {
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
}
