package com.deepak.microservices.movieinfoservice.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deepak.microservices.movieinfoservice.models.Movie;

@RestController
@RequestMapping("/movies")
public class MovieResource {
	
	@GetMapping("/{movieId}")
	public Movie getMovieInfo(@PathVariable("movieId") String movieId) {
		String[] moviesArray = new String []{"Luka chupi", "Avengers", "Black Window", "Spies In Disguies", "SpiderMan", "Iron Man", "Thor", "Dr. Strange", "Star Wars", "Fast & furious"};
		int x = (int)(Math.random()*(10));
		return new Movie(movieId, moviesArray[x]);
	}

}
