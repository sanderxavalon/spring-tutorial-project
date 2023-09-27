package com.tibame.lab.dip.benzImpl;

import com.tibame.tutorial.dip.theinterface.ITire;

public class BenzTire implements ITire{
	
	private int size;

	public BenzTire(int size) {
		this.size = size;
	}
	
	@Override
	public void drive() {
		System.out.println("I'm Benz Tire! Size:" + size);
	}
	
}
