package com.docker.example.docker.service;


import com.docker.example.docker.entity.Recomendation;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RecomendationService {
    List<Recomendation> listRecomendation();


}
