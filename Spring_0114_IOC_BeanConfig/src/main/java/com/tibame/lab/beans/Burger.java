package com.tibame.lab.beans;

// 這邊不用@Component，我們不需要接管它，需要到BurgerConfiguration手動new
public class Burger {
	
	private int size;
	
	private String cheeseType;
	
	private double price;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getCheeseType() {
		return cheeseType;
	}

	public void setCheeseType(String cheeseType) {
		this.cheeseType = cheeseType;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}
