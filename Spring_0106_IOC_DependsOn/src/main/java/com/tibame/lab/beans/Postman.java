package com.tibame.lab.beans;

import java.util.ArrayList;

public class Postman {

	private final static ArrayList<String> POST_OFFICE = new ArrayList<String>();
	
	public static void sendMessage(String name) {
		POST_OFFICE.add(name);
	}
	
	public static void validate() {
		if (POST_OFFICE.get(0).equals("BeanA")) {
			System.out.println("GO FIX YOUR XML!");
		} else {
			System.out.println("Great Job!");			
		}

	}

}
