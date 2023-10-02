package com.tibame.tutorial.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.tibame.tutorial")
@EnableAspectJAutoProxy
public class AppConfig {

}
