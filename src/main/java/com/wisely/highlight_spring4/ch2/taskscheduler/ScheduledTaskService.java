package com.wisely.highlight_spring4.ch2.taskscheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by chenjinming on 2017/2/23.
 */
@Service
public class ScheduledTaskService {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime(){
        System.out.println(" execute every five seconds : " + dateFormat.format(new Date()) );
    }

    @Scheduled(cron = "0 59 19 ? * *")
    public void fixTimeExecution(){
        System.out.println(" execute fix time : " + dateFormat.format(new Date()) );
    }
}
