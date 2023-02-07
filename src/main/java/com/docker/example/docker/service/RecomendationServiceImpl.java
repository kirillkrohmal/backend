package com.docker.example.docker.service;

import com.docker.example.docker.entity.Recomendation;
import com.docker.example.docker.repository.RecomendationRepository;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecomendationServiceImpl implements RecomendationService {
    @Autowired
    public RecomendationRepository recomendationRepository;


    @Override
    public List<Recomendation> listRecomendation() {
        return Lists.newArrayList(recomendationRepository.findAll());
    }

}
