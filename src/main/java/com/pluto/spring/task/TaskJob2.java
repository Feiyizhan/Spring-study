package com.pluto.spring.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component("taskJob2")
public class TaskJob2 {
    @Scheduled(cron = "0/5 * * * * ?")
    public void job1() {  
        System.out.println("任务进行中2。。。");  
    }
}
