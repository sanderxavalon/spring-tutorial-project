package com.tibame.lab.beans;

public class NotBoringBean {
	
	private Checker checker;

	public static NotBoringBean createInstance() {
		var bean = new NotBoringBean();
		bean.setChecker(new Checker());
		return bean;
	}

	public Checker getChecker() {
		return checker;
	}

	public void setChecker(Checker checker) {
		this.checker = checker;
	}
	
	public void checkerSpeak() {
		try {
			this.checker.validate();			
		} catch (Exception e) {
			System.out.println("GO FIX YOUR XML!");
		}
		
	}
	
	
}


class Checker {
	public void validate() {
		System.out.println("You made it!");
	}
}