package com.tibame.tutorial.env;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import jakarta.annotation.PostConstruct;

@Profile("prod")
@Configuration
public class ProdConfig {

	ProdConfig() {
		System.out.print("Prod 啟動!");
	}
}
