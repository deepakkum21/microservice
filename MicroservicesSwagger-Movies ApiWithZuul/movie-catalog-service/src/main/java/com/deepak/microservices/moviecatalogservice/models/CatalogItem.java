package com.deepak.microservices.moviecatalogservice.models;

import io.swagger.annotations.ApiModelProperty;

public class CatalogItem {
	
	@ApiModelProperty(notes="name in the Catalog")
	private String name;
	
	@ApiModelProperty(notes="description in the Catalog")
	private String desc;
	
	@ApiModelProperty(notes="rating in the Catalog")
	private int rating;
	
	public CatalogItem() {
		super();
	}
	public CatalogItem(String name, String desc, int rating) {
		super();
		this.name = name;
		this.desc = desc;
		this.rating = rating;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}

}
