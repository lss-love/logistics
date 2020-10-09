package com.lian.common;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 此类是控制全局异常处理的类
 */
@ControllerAdvice //使用该注解表示开启了全局异常的捕获
public class CommonException {

    //给controller添加异常处理，括号中指定要捕获处理哪种异常，Exception.class表示处理所有种类的异常
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResultJson commonException(Exception e){
        System.out.println(e);
        return new ResultJson(0,e.getMessage());
    }
}
