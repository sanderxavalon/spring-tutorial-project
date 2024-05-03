package com.tibame.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.tibame")
@PropertySource("classpath:application-${spring.profiles.active:dev}.properties")
public class SpringiocConfig {

	@Value("${database.driver}")
	private String driver;
	@Value("${database.url}")
	private String url;
	@Value("${database.username}")
	private String userName;
	@Value("${database.password}")
	private String password;

	@Bean
	public DriverManagerDataSource datasource() {
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setDriverClassName(driver);
		datasource.setUrl(url);
		datasource.setUsername(userName);
		datasource.setPassword(password);
		return datasource;
	}
	
}
