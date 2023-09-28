package com.tibame.lab.beans;

import org.springframework.util.StopWatch;

public class MessageReceiver implements Runnable{
	
	private static StopWatch stopWatch = new StopWatch();

	@Override
	public void run() {
		stopWatch.start();
		System.out.println("Stop Watch Start!");
	}
	
	public static void getStopSignalFromBean() {
		stopWatch.stop();
		var seconds = stopWatch.getTotalTimeSeconds();
		
		if (seconds < 3) {
			System.out.println("GO FIX YOUR XML!");
		} else {
			System.out.println("You make it!");
		}
	}


}
