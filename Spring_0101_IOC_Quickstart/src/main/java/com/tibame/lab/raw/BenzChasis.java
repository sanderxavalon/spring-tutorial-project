package com.tibame.lab.raw;

public class BenzChasis {
	
	private BenzTire tire;

	public BenzChasis() {
		this.tire = new BenzTire();
	}
	
	public void drive() {
		tire.drive();
		System.out.println("I'm Benz Chasis");
	}

}
