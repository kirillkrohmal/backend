package com.docker.example.docker.repository;


import com.docker.example.docker.entity.Recomendation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface RecomendationRepository extends JpaRepository<Recomendation, Integer> {
    List<Recomendation> findAll();
}
