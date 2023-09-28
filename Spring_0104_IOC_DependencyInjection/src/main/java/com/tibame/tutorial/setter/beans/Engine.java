package com.tibame.tutorial.setter.beans;

public class Engine {
	
	private String brand;
	private Integer lifeYear;
	
	@Override
	public String toString() {
		return "Engine [brand=" + brand + ", lifeYear=" + lifeYear + "]";
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setLifeYear(Integer lifeYear) {
		this.lifeYear = lifeYear;
	}
	
}

