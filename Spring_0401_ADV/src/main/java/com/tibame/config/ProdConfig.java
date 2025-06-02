package com.tibame.config;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("prod")
@Configuration
public class ProdConfig {
	
	private final Logger log = LoggerFactory.getLogger(DevConfig.class);

	ProdConfig() {
		log.info("Prod 啟動!");
	}
	
}
