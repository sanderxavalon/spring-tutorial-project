package com.tibame.tutorial.config.env;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("prod")
public class ProdConfig {

	@PostConstruct
	public void prodConfig() {
		System.out.print("Prod 啟動!");
	}
}
