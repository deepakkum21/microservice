package com.deepak.microservices.ratingsdataservice.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deepak.microservices.ratingsdataservice.models.Rating;
import com.deepak.microservices.ratingsdataservice.models.UserRating;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/ratingsdata")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@Api(value="Ratings Resource", description="shows Rating end point rest api")
public class RatingsResource {
	
	@GetMapping("/{movieId}")
	@ApiOperation(value = "returns Rating Object")
	public Rating getRating(@PathVariable("movieId") String movieId) {
		return new Rating("1",1);
	}
	
	@GetMapping("/users/{userId}")
	@ApiOperation(value = "returns UserRating Object")
	public UserRating getUserRating(@PathVariable("userId") String userId) {
		UserRating userRating = new UserRating();
		List<Rating> ratingList = Arrays.asList(new Rating("1",1));
		userRating.setUserRating(ratingList);
		return userRating;
	}

}
