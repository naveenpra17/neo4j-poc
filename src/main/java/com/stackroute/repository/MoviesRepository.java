package com.stackroute.repository;

import com.stackroute.domain.Critic;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoviesRepository extends Neo4jRepository<Critic, Integer> {
}
