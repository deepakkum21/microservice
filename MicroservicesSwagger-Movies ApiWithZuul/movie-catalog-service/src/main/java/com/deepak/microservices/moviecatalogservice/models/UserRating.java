package com.deepak.microservices.moviecatalogservice.models;

import java.util.List;

import io.swagger.annotations.ApiModelProperty;

public class UserRating {
	
	@ApiModelProperty(notes="userRating list of the Rating")
	private List<Rating> userRating;

	public List<Rating> getUserRating() {
		return userRating;
	}

	public void setUserRating(List<Rating> userRating) {
		this.userRating = userRating;
	}

}
