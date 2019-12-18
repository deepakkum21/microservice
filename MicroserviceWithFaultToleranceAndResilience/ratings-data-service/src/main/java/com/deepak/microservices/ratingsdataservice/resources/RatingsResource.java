package com.deepak.microservices.ratingsdataservice.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deepak.microservices.ratingsdataservice.models.Rating;
import com.deepak.microservices.ratingsdataservice.models.UserRating;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsResource {
	
	@GetMapping("/{movieId}")
	public Rating getRating(@PathVariable("movieId") String movieId) {
		return new Rating("1",1);
	}
	
	@GetMapping("/users/{userId}")
	public UserRating getUserRating(@PathVariable("userId") String userId) {
		int randomRating = (int)(Math.random()*(6));
		int randomUserid = (int)(Math.random()*(10));
		UserRating userRating = new UserRating();
		List<Rating> ratingList = Arrays.asList(new Rating(Integer.toString(randomUserid),randomRating));
		userRating.setUserRating(ratingList);
		return userRating;
	}

}
