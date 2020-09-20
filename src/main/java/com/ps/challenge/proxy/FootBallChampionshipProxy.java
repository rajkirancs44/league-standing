package com.ps.challenge.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.ps.challenge.model.Country;
import com.ps.challenge.model.League;

@FeignClient(name="FootBall-API",url="${football.api.base.url}")
public interface FootBallChampionshipProxy {

	@GetMapping("${football.api.country.url}")
	public Country[] getListOfCountries();
	

	@GetMapping("?action=get_leagues&APIkey=9bb66184e0c8145384fd2cc0f7b914ada57b4e8fd2e4d6d586adcc27c257a978")
	public League[] getListOfLeagues();
	
	@GetMapping("?action=get_countries&APIkey=9bb66184e0c8145384fd2cc0f7b914ada57b4e8fd2e4d6d586adcc27c257a978")
	public Country[] getListOfTeams();
	
	
}
