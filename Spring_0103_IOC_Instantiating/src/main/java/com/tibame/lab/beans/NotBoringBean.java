package com.tibame.lab.beans;

public class NotBoringBean {
	
	private static NotBoringBean notBoringBean = new NotBoringBean();
	
	// 不用理我
	private Checker checker;

	// 我好像不是建構子耶
	public static NotBoringBean createInstance() {
		notBoringBean.setChecker(new Checker());
		return notBoringBean;
	}
	
	// 檢核的地方，不用理我
	public void checkerSpeak() {
		try {
			this.checker.validate();			
		} catch (Exception e) {
			System.out.println("配置錯誤囉！再檢查一下吧！");
		}
		
	}
	
	// 我只是一般的Getter/Setter
	public Checker getChecker() {
		return checker;
	}

	public void setChecker(Checker checker) {
		this.checker = checker;
	}
	
}

// 不用理我
class Checker {
	public void validate() {
		System.out.println("配置成功囉！");
	}
}