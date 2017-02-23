package com.wisely.highlight_spring4.ch3.annotation;

import org.springframework.stereotype.Service;

/**
 * Created by chenjinming on 2017/2/23.
 */
@Service
public class DemoService {
    public void outputResult(){
        System.out.println("from combining annotation ");
    }
}
