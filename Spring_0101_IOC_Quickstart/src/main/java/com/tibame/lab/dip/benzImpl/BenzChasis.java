package com.tibame.lab.dip.benzImpl;

import com.tibame.tutorial.dip.theinterface.IChasis;
import com.tibame.tutorial.dip.theinterface.ITire;

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
