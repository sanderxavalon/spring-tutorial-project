package com.tibame.tutorial.beans.tire;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class BenzTire extends Tire {

	@Override
	public String toString() {
		return "BenzTire";
	}
	
}
