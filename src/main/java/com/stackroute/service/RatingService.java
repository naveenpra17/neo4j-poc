package com.stackroute.service;

import com.stackroute.domain.Critic;

import java.util.Collection;

public interface RatingService {

    Critic getCriticById(long id);
    Critic saveCritic(Critic movie);
    Collection<Critic> getAllCritic();
    Critic deleteCriticById(long id);
    Critic updateCriticById(Critic movie);
}
