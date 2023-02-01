package com.docker.example.docker;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerApplication.class, args);
	}
}


/*
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class DockerApplication {

	@RequestMapping("/api/recomendations")
	public List<RecomendationNoDB> home() {
		return RecomendationNoDB.getRecomendations();
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerApplication.class, args);
	}
}
*/
