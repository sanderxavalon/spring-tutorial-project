package com.tibame.lab.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Tomato {
	
	private Integer size;

	public Tomato(@Value("10") Integer size) {
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
