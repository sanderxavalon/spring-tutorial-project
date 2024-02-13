package com.tibame.tutorial.config.env;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import jakarta.annotation.PostConstruct;

@Configuration
// 若在沒指定環境下會修先使用設定default的profile 
@Profile({"dev"})
public class DevConfig {
	
	@PostConstruct
	public void devConfig() {
		System.out.print("DEV 啟動!");
	}

}
