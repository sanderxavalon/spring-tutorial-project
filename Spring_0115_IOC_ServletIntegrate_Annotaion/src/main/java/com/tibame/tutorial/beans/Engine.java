package com.tibame.tutorial.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {
	
	@Value("Mazda")
	private String brand;
	@Value("10")
	private Integer lifeYear;
	
	@Override
	public String toString() {
		return "Engine [brand=" + brand + ", lifeYear=" + lifeYear + "]";
	}
	
}

