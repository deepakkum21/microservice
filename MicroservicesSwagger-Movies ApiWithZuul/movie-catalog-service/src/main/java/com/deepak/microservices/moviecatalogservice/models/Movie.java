package com.deepak.microservices.moviecatalogservice.models;

import io.swagger.annotations.ApiModelProperty;

public class Movie {
	
	@ApiModelProperty(notes="movieId of the Movie Object")
	private String movieId;
	
	@ApiModelProperty(notes="name of the Movie Object")
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
