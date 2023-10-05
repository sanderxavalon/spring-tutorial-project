package com.tibame.tutorial.beans.tire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BMWTire extends Tire {

	@Override
	public String toString() {
		return "BMWTire [size=" + size + "]";
	}
	
	@Autowired
	@Override
	public void setSize(@Value("50") Integer size) {
		super.setSize(size);
	}
	
}
