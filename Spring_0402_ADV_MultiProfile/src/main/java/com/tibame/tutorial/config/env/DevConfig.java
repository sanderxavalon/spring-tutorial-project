package com.tibame.tutorial.config.env;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
// 若在沒指定環境下會修先使用設定default的profile 
@Profile({"dev"})
public class DevConfig {
	
	@PostConstruct
	public void devConfig() {
		System.out.print("DEV 啟動!");
	}

}
