package com.stpl.deepak.hotel.update.restapi.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.fasterxml.jackson.annotation.JsonProperty;

@Document(collection = "HOTEL")
public class HotelModel {
	@Id
	private String id;
	
	@Indexed(unique = true)
	@Field("HotelId")
	private String hotelId;
	
	@Field("HotelName")
	private String hotelName;
	
	@Field("RatedStar")
	@Indexed(direction = IndexDirection.ASCENDING)
	private int ratedStar;
	
	@Field("PricePerNight")
	@Indexed(direction = IndexDirection.ASCENDING)
	private int pricePerNight;
	
	@Field("PaymentMode")
	private List<String> paymentMode;
	
	@JsonProperty
	@Field("IsInternational")
	private boolean isInternational;
	
	public HotelModel() {
		super();
	}

	public HotelModel(String hotelId, String hotelName, int ratedStar, int pricePerNight, List<String> paymentMode,
			boolean isInternational) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.ratedStar = ratedStar;
		this.pricePerNight = pricePerNight;
		this.paymentMode = paymentMode;
		this.isInternational = isInternational;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getHotelId() {
		return hotelId;
	}

	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public int getRatedStar() {
		return ratedStar;
	}
	public void setRatedStar(int ratedStar) {
		this.ratedStar = ratedStar;
	}
	public int getPricePerNight() {
		return pricePerNight;
	}
	public void setPricePerNight(int pricePerNight) {
		this.pricePerNight = pricePerNight;
	}

	public List<String> getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(List<String> paymentMode) {
		this.paymentMode = paymentMode;
	}

	public boolean getIsInternational() {
		return isInternational;
	}

	public void setIsInternational(boolean isInternational) {
		this.isInternational = isInternational;
	}
}
