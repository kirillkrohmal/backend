package com.docker.example.docker.service;

import com.docker.example.docker.entity.Recomendation;
import com.docker.example.docker.repository.RecomendationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecomendationServiceImpl implements RecomendationService {
    public RecomendationRepository recomendationRepository;

    @Autowired
    public RecomendationServiceImpl(RecomendationRepository recomendationRepository) {
        this.recomendationRepository = recomendationRepository;
    }

    @Override
    public List<Recomendation> listRecomendation() {
        return recomendationRepository.findAll();
    }
}