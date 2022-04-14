package com.example.controller.utils;


import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectExceptionAdvice {

    @ExceptionHandler(Exception.class)
    public R doException(Exception exception){
        //打印异常
        exception.printStackTrace();
        return new R("服务器故障，请联系管理员");
    }
}
