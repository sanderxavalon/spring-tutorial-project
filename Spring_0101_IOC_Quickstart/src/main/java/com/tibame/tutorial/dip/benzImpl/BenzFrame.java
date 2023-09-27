package com.tibame.tutorial.dip.benzImpl;

import com.tibame.tutorial.dip.theinterface.IChasis;
import com.tibame.tutorial.dip.theinterface.IFrame;

public class BenzFrame implements IFrame{
	
	private IChasis chasis;
	
	public BenzFrame(IChasis chasis) {
		this.chasis = chasis;
	}

	@Override
	public void drive() {
		chasis.drive();
		System.out.println("I'm Benz Frame");
	}
	
}
