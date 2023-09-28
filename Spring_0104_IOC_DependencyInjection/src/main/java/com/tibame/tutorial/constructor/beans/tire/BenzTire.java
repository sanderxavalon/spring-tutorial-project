package com.tibame.tutorial.constructor.beans.tire;

public class BenzTire extends Tire {

	public BenzTire(Integer size) {
		super(size);
	}

	@Override
	public String toString() {
		return "BenzTire [size=" + size + "]";
	}
	
}
