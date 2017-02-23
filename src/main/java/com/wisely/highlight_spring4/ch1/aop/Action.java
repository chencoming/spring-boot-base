package com.wisely.highlight_spring4.ch1.aop;

import java.lang.annotation.*;

/**
 * Created by chenjinming on 2017/2/22.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
