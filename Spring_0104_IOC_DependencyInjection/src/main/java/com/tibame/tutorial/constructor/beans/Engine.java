package com.tibame.tutorial.constructor.beans;

public class Engine {
	
	private String brand;
	private Integer lifeYear;
	
	public Engine(String brand, Integer lifeYear) {
		this.brand = brand;
		this.lifeYear = lifeYear;
	}

	@Override
	public String toString() {
		return "Engine [brand=" + brand + ", lifeYear=" + lifeYear + "]";
	}
	
}
