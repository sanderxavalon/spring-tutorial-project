package com.tibame.tutorial.ioc.mazdaImpl;

import com.tibame.tutorial.ioc.theinterface.ITire;

public class MazdaTire implements ITire {
	
	private double size;
	
	public MazdaTire(double size) {
		this.size = size;
	}

	@Override
	public void drive() {
		System.out.println("I'm Mazda Tire! Size:" + size);
	}

}
