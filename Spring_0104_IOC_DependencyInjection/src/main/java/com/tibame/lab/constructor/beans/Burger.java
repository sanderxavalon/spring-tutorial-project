package com.tibame.lab.constructor.beans;

import com.tibame.lab.constructor.beans.cheese.Cheese;

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

	public Cheese getCheeseOnTop() {
		return cheeseOnTop;
	}

	public Cheese getCheeseOnBottom() {
		return cheeseOnBottom;
	}

	public Lettuce getLettuce() {
		return lettuce;
	}

	public Tomato getTomato() {
		return tomato;
	}
	
}
