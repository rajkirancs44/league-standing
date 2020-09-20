package com.ps.challenge.controller;

import java.util.Arrays;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ps.challenge.model.Country;
import com.ps.challenge.model.League;
import com.ps.challenge.model.LeagueStandingRequestModel;
import com.ps.challenge.proxy.FootBallChampionshipProxy;

@RestController
@RequestMapping("/api/standing")
public class StandingDisplayController {

	
	@Autowired
	private  FootBallChampionshipProxy proxy;
	
	
	
	//@GetMapping(path="/{teamName}/{countryName}/{leaugeName}")
	@GetMapping
	public void getLeagueStanding(@Valid LeagueStandingRequestModel leagueStandingRequest) {
		System.out.println(leagueStandingRequest.getCountryName()+"::::"+leagueStandingRequest.getLeagueName()+"::::::"
	+leagueStandingRequest.getTeamName()); 	
		
		Country[] countries= proxy.getListOfCountries();
		Arrays.asList(countries).stream().forEach(c-> System.out.println(c.getCountryId()));
		
		League[] leagues= proxy.getListOfLeagues();
		Arrays.asList(leagues).stream().forEach(l-> System.out.println(l.getLeagueId()));
		
	}
	
	
}


