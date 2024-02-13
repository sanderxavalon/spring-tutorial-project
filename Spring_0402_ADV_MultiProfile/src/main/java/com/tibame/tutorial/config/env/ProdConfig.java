package com.tibame.tutorial.config.env;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import jakarta.annotation.PostConstruct;

@Configuration
@Profile("prod")
public class ProdConfig {

	@PostConstruct
	public void prodConfig() {
		System.out.print("Prod 啟動!");
	}
}
