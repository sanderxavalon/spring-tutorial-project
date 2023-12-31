package com.tibame.tutorial.config;

import java.io.IOException;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages = "com.tibame.tutorial")
@EnableAspectJAutoProxy
@EnableTransactionManagement
@PropertySource("classpath:application-${spring.profiles.active:dev}.properties")
public class AppConfig {

	@Value("${database.driver}")
	private String driver;
	@Value("${database.url}")
	private String url;
	@Value("${database.username}")
	private String userName;
	@Value("${database.password}")
	private String password;
	@Value("hibernate-${spring.profiles.active:dev}.properties")
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

	@Bean
	public LocalSessionFactoryBean sessionFactory() throws IOException {
		LocalSessionFactoryBean bean = new LocalSessionFactoryBean();
		bean.setDataSource(datasource());
		bean.setPackagesToScan("com.tibame.tutorial");
		bean.setHibernateProperties(hibernateProperties());
		return bean;
	}

	@Bean
	public HibernateTemplate hibernateTemplate() throws IOException {
		HibernateTemplate hibernateTemplate = new HibernateTemplate();
		hibernateTemplate.setSessionFactory(this.sessionFactory().getObject());
		return hibernateTemplate;
	}

	@Bean
	public HibernateTransactionManager transactionManager() throws IOException {
		HibernateTransactionManager txManager = new HibernateTransactionManager();
		txManager.setSessionFactory(this.sessionFactory().getObject());
		return txManager;
	}

	private final Properties hibernateProperties() throws IOException {
		return PropertiesLoaderUtils.loadProperties(new ClassPathResource(hibernatePropsPath));
	}
}
