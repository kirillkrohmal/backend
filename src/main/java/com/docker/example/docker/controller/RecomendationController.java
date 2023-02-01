package com.docker.example.docker.controller;

import com.docker.example.docker.entity.Recomendation;
import com.docker.example.docker.service.RecomendationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RecomendationController {
    @Autowired
    private RecomendationServiceImpl recomendationService;


    @GetMapping("recomendation")
    public List<Recomendation> getRecomendation( Recomendation recomendation) {
        recomendationService.saveRequest(recomendation);

        return recomendationService.listRecomendation();
    }
}
