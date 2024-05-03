package com.tibame.tutorial.env;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import jakarta.annotation.PostConstruct;

@Profile("dev")
@Configuration
public class DevConfig {
	
	DevConfig() {
		System.out.print("DEV 啟動!");
	}

}
