package com.wisely.highlight_spring4.ch3.annotation;

import com.wisely.highlight_spring4.ch2.profile.DemoBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by chenjinming on 2017/2/23.
 */
@WiselyConfiguration("com.wisely.highlight_spring4.ch3.annotation")
public class Main {

    public static void main(String [] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);

        DemoService demoService = context.getBean(DemoService.class);
        demoService.outputResult();
        context.close();

    }
}
