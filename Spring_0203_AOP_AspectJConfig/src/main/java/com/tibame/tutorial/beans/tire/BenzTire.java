package com.tibame.tutorial.beans.tire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class BenzTire extends Tire {

	@Override
	public String toString() {
		return "BenzTire [size=" + size + "]";
	}

	@Autowired
	@Override
	public void setSize(@Value("20") Integer size) {
		super.setSize(size);
	}
	
}
