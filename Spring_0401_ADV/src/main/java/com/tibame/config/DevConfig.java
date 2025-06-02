package com.tibame.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("dev")
@Configuration
public class DevConfig {
	
	private final Logger log = LoggerFactory.getLogger(DevConfig.class);
	
	DevConfig() {
		log.info("DEV 啟動!");
	}

}
