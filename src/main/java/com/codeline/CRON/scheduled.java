package com.codeline.CRON;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

//Created a scheduled class
//adding a component
@Component
public class scheduled {
    @Scheduled(cron = "0 0 * * * *") // CRON expression for running every 5 minutes
    public void scheduled() {
        System.out.println("Hello World");
    }
}
