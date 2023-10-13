package com.tibame.lab.beans;

import java.util.ArrayList;

public class Postman {

	private final static ArrayList<String> POST_OFFICE = new ArrayList<String>();
	
	public static void sendMessage(String name) {
		POST_OFFICE.add(name);
	}
	
	public static void validate() {
		if (POST_OFFICE.get(0).equals("BeanA")) {
			System.out.println("第一個Bean不是BeanA，再試試看吧﹗");
		} else {
			System.out.println("配置成功！");			
		}

	}

}
