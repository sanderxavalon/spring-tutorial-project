package com.tibame.lab.beans;

import java.util.ArrayList;

public class MessageReceiver {
	
	private static ArrayList<String> messages = new ArrayList<String>();

	
	public static void sendMessage(String message) {
		messages.add(message);
	}
	
	public static void validate() {
		System.out.println("Validtion:");
		if(messages.size() < 2) {
			throw new RuntimeException("GO FIX YOUR XML!");
		}
		messages.stream().forEach((x)-> {
			System.out.println(x);
		});
		System.out.println("You make it!");
	}


}
