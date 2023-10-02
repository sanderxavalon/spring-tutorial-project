package com.tibame.tutorial.beans;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {

	public void pay() {
		System.out.println("This is payservice!");
	}

}
