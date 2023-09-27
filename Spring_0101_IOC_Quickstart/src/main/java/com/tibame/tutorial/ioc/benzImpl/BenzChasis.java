package com.tibame.tutorial.ioc.benzImpl;

import com.tibame.tutorial.ioc.theinterface.IChasis;
import com.tibame.tutorial.ioc.theinterface.ITire;

public class BenzChasis implements IChasis{
	
	private ITire tire;

	public BenzChasis(ITire tire) {
		this.tire = tire;
	}
	
	@Override
	public void drive() {
		tire.drive();
		System.out.println("I'm Benz Chasis");
	}

}
