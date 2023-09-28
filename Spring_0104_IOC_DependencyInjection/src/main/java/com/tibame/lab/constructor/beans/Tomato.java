package com.tibame.lab.constructor.beans;

public class Tomato {
	
	private Integer size;

	public Tomato(Integer size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Tomato [size=" + size + "]";
	}

	public Integer getSize() {
		return size;
	}
	
}
