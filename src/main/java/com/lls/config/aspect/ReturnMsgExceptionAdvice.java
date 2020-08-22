package com.lls.config.aspect;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
@Slf4j
public class ReturnMsgExceptionAdvice {

    @ExceptionHandler(Throwable.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public ReturnMsg exceptionHandler(Throwable e){
      log.error("exception ",e);
      return ReturnMsg.createFail().fail("系统错误"+e.getMessage());
    }

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public ReturnMsg exceptionHandler(IllegalArgumentException e){
        log.error("IllegalArgumentException ",e);
        return ReturnMsg.createFail().fail("参数错误"+e.getMessage());
    }

}

