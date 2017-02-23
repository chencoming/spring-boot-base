package com.wisely.highlight_spring4.ch2.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by chenjinming on 2017/2/23.
 */
@Configuration
@ComponentScan("com.wisely.highlight_spring4.ch2.event")
public class Main {

    public static void main(String [] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);
        demoPublisher.publish("hello application event");
        context.close();
    }
}
