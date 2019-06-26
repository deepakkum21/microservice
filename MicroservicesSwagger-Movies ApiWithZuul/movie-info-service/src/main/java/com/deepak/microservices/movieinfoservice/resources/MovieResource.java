package com.deepak.microservices.movieinfoservice.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deepak.microservices.movieinfoservice.models.Movie;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/movies")
@Api(description="shows the movie resource end point api")
public class MovieResource {
	
	@GetMapping("/{movieId}")
	@ApiOperation(value = "returns movie info for given movieId")
	public Movie getMovieInfo(@PathVariable("movieId") String movieId) {
		return new Movie(movieId, "Luka chupi"+movieId);
	}

}
