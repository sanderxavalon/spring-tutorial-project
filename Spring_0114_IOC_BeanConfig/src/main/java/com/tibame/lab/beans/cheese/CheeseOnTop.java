package com.tibame.lab.beans.cheese;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CheeseOnTop extends Cheese {

	public CheeseOnTop(@Value("Cheddar") String type) {
		super(type);
	}

	@Override
	public String toString() {
		return "CheeseOnTop [type=" + type + "]";
	}

	

}
