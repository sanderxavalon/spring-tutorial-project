package com.tibame;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.ScheduledAnnotationBeanPostProcessor;
import org.springframework.scheduling.config.ScheduledTask;

@EnableScheduling
@SpringBootApplication
public class Spring0401AdvApplication {
	
	private final Logger log = LoggerFactory.getLogger(Spring0401AdvApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(Spring0401AdvApplication.class, args);
	}


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
			log.info("[cron]:" + i);
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
	

	@Async
	@Scheduled(fixedRate = 5, timeUnit = TimeUnit.SECONDS)
	public void fixedRate() throws InterruptedException {
		if(index >= list.size()) {
			cancelScheduleTask("fixedRate");
		    return;
		};
		var x = list.get(index);
		log.info("[Fixed Rate] 執行" + x + "秒");
		for (int i = 1; i <= x; i++) {
			log.info("[Fixed Rate]:" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		index++;
	}

	
	
}
