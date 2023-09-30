package com.tibame.lab.beans.cheese;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class CheeseOnBottom extends Cheese {

	public CheeseOnBottom(@Value("Cottage") String type) {
		super(type);
	}

	@Override
	public String toString() {
		return "CheeseOnBottom [type=" + type + "]";
	}
	
}
