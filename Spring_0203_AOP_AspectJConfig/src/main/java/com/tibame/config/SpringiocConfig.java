package com.tibame.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan(basePackages = "com.tibame.tutorial")
@EnableAspectJAutoProxy
public class SpringiocConfig {

}
