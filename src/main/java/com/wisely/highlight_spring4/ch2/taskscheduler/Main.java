package com.wisely.highlight_spring4.ch2.taskscheduler;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by chenjinming on 2017/2/23.
 */
@Configuration
@ComponentScan("com.wisely.highlight_spring4.ch2.taskscheduler")
@EnableScheduling
public class Main {

    public static void main(String [] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
    }
}
