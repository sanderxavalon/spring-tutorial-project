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
			System.out.println("好像沒有抓到配置喔，在確認一下XML跟Annotation吧！");
			return;
		}
		messages.stream().forEach((x)-> {
			System.out.println(x);
		});
		System.out.println("配置成功!");
	}


}
