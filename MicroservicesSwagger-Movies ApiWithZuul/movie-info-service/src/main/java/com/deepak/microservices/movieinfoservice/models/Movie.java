package com.deepak.microservices.movieinfoservice.models;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class Movie {
	
	@ApiModelProperty(notes="movieId Of the movie")
	private String movieId;
	
	@ApiModelProperty(notes="movie Name Of the movie")
	private String name;
	public Movie() {
		super();
	}
	public Movie(String movieId, String name) {
		super();
		this.movieId = movieId;
		this.name = name;
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
