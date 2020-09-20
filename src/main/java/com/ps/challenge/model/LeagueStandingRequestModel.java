package com.ps.challenge.model;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class LeagueStandingRequestModel {

	@NotBlank
	private String leagueName;
	
	@NotBlank
	private String countryName;
	
	@NotBlank
	private String teamName;
	
}
