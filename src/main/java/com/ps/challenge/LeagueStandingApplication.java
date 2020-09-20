package com.ps.challenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.ps.challenge.*")
public class LeagueStandingApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeagueStandingApplication.class, args);
	}

}
