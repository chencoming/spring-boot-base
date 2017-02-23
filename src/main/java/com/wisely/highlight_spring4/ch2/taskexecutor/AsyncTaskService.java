package com.wisely.highlight_spring4.ch2.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by chenjinming on 2017/2/23.
 */
@Service
public class AsyncTaskService {

    @Async
    public void executeAsyncTask(Integer i){
        System.out.println("executing counting : " + i);
    }

    @Async
    public void executeAsyncTaskPlus(Integer i){
        System.out.println("executing add 1 is : " + ++i);
    }
}
