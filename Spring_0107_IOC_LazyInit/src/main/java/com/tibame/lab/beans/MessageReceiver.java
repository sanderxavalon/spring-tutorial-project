package com.tibame.lab.beans;

import org.springframework.util.StopWatch;

// 這是我的小間諜，不用理他
public class MessageReceiver implements Runnable{
	
	private static StopWatch stopWatch = new StopWatch();

	@Override
	public void run() {
		stopWatch.start();
		System.out.println("碼表啟動！");
	}
	
	public static void getStopSignalFromBean() {
		stopWatch.stop();
		var seconds = stopWatch.getTotalTimeSeconds();
		
		if (seconds < 3) {
			System.out.println("太快出來了吧，再檢查一下配置喔！");
		} else {
			System.out.println("配置成功！");
		}
	}


}
