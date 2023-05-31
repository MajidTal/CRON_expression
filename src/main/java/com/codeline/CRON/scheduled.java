package com.codeline.CRON;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class scheduled {
    @Scheduled(cron = "0 0 8 ? * MON *")
    public void scheduled() {
        System.out.println("Hello World");
    }
}
