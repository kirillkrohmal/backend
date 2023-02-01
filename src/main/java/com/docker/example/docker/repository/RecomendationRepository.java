package com.docker.example.docker.repository;


import com.docker.example.docker.entity.Recomendation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;


@RepositoryRestResource(collectionResourceRel="recomendations", path="recomendations")
public interface RecomendationRepository extends JpaRepository<Recomendation, Integer> {

    List<Recomendation> findAll();
}
