package com.tibame.tutorial.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
// @Configuration 是告訴Spring這是類似xml的設定檔
public class DataSourceConfiguration {

	@Bean
	// 而@Bean則是類似Xml裡面的@Bean標籤
	public DriverManagerDataSource datasource() {
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setDriverClassName("org.h2.Driver");
		datasource.setUrl("jdbc:h2:tcp://localhost:9091/mem:testcase1");
		datasource.setUsername("sa");
		datasource.setPassword("");
		return datasource;
	}

}
