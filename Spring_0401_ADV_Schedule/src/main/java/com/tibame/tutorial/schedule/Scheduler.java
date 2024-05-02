package com.tibame.tutorial.schedule;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.ScheduledAnnotationBeanPostProcessor;
import org.springframework.scheduling.config.ScheduledTask;
import org.springframework.stereotype.Component;

@Component
public class Scheduler {

	private final Log log = LogFactory.getLog(getClass());

	List<Integer> list = List.of(6, 1, 7, 2, 1);

	int index = 0;
	
	
	@Autowired
	private ScheduledAnnotationBeanPostProcessor postProcessor;
	
	public void cancelScheduleTask(String methodName) {
	    Set<ScheduledTask> setTasks = postProcessor.getScheduledTasks();
	    setTasks.stream().forEach((x)-> {
	    	if(x.toString().equals(this.getClass().getName() + "." + methodName)) {
	    		x.cancel();
	    	}
	    });
	}
	
	@Scheduled(cron = "*/5 * * * * *")
	public void cron() throws InterruptedException {
		if(index >= list.size()) {
			cancelScheduleTask("cron");
		    return;
		};
		var x = list.get(index);
		log.info("[cron] 執行" + x + "秒");
		for (int i = 1; i <= x; i++) {
			log.info(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		index++;
	}
	
	@Scheduled(fixedDelay = 5, timeUnit = TimeUnit.SECONDS)
	public void fixedDelay() throws InterruptedException {
		if(index >= list.size()) {
			cancelScheduleTask("fixedDelay");
		    return;
		};
		var x = list.get(index);
		log.info("[Fixed Delay] 執行" + x + "秒");
		for (int i = 1; i <= x; i++) {
			log.info("[Fixed Delay]:" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		index++;
	}
	


	@Scheduled(fixedRate = 5, timeUnit = TimeUnit.SECONDS)
	public void fixedRate() throws InterruptedException {
		if(index >= list.size()) {
			cancelScheduleTask("fixedRate");
		    return;
		};
		var x = list.get(index);
		log.info("[Fixed Rate] 執行" + x + "秒");
		for (int i = 1; i <= x; i++) {
			log.info(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		index++;
	}

}
