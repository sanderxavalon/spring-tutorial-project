package com.tibame.tutorial.beans.tire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MazdaTire extends Tire {

	@Override
	public String toString() {
		return "MazdaTire";
	}
	
}
