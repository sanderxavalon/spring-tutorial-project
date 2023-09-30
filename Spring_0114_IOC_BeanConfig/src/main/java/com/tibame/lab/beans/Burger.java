package com.tibame.lab.beans;

import org.springframework.stereotype.Component;

import com.tibame.lab.beans.cheese.Cheese;

@Component
public class Burger {
	
	private Cheese cheeseOnTop;
	private Cheese cheeseOnBottom;
	private Lettuce lettuce;
	private Tomato tomato;
	
	
	public Burger(Cheese cheeseOnTop, Cheese cheeseOnBottom, Lettuce lettuce, Tomato tomato) {
		this.cheeseOnTop = cheeseOnTop;
		this.cheeseOnBottom = cheeseOnBottom;
		this.lettuce = lettuce;
		this.tomato = tomato;
	}

	@Override
	public String toString() {
		return "Burger [cheeseOnTop=" + cheeseOnTop + ", cheeseOnBottom=" + cheeseOnBottom + ", lettuce=" + lettuce
				+ ", tomato=" + tomato + "]";
	}

}
