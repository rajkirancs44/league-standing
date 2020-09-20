package com.ps.challenge.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Country {

	@JsonProperty("country_name")
	private String countryName;
	
	@JsonProperty("country_id")
	private String countryId;
	
	@JsonProperty("country_logo")
	private String countryLogo;
	
	
}
