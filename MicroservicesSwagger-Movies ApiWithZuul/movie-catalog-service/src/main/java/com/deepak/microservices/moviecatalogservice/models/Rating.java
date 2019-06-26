package com.deepak.microservices.moviecatalogservice.models;

import io.swagger.annotations.ApiModelProperty;

public class Rating {
	
	@ApiModelProperty(notes="movie Id of the rating Object")
	private String movieId;
	
	@ApiModelProperty(notes="rating of the rating Object")
	private int rating;
	
	
	public Rating() {
		super();
	}
	public Rating(String movieId, int rating) {
		super();
		this.movieId = movieId;
		this.rating = rating;
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	

}
