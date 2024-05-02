package com.tibame.config;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages = "com.tibame.tutorial")
@EnableAspectJAutoProxy
@EnableTransactionManagement
@PropertySource("classpath:application.properties")
public class SpringiocConfig {

	@Value("${database.driver}")
	private String driver;
	@Value("${database.url}")
	private String url;
	@Value("${database.username}")
	private String userName;
	@Value("${database.password}")
	private String password;
	@Value("hibernate.properties")
	private String hibernatePropsPath;

	@Bean
	public DriverManagerDataSource datasource() {
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setDriverClassName(driver);
		datasource.setUrl(url);
		datasource.setUsername(userName);
		datasource.setPassword(password);
		return datasource;
	}
	
	@Bean JdbcTemplate jdbcTemplate() {
		return new JdbcTemplate(datasource());
	}

	@Bean
	public DataSourceTransactionManager transactionManager() {
		DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
		transactionManager.setDataSource(datasource());
		return transactionManager;
	}

}
