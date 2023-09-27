package com.tibame.tutorial.dip.mazdaImpl;

import com.tibame.tutorial.dip.theinterface.ITire;

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
