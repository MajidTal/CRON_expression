package com.codeline.CRON;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class scheduled {
    @Scheduled(cron = "0 0 3 1 * *")
    public void scheduled() {
        System.out.println("Hello World");
    }
}
