package com.tibame.tutorial.constructor.beans.tire;

public class BMWTire extends Tire {

	public BMWTire(Integer size) {
		super(size);
	}

	@Override
	public String toString() {
		return "BMWTire [size=" + size + "]";
	}
	

}