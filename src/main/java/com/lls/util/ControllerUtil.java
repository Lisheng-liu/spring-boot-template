package com.lls.util;

import lombok.extern.slf4j.Slf4j;

import java.util.UUID;

@Slf4j
public class ControllerUtil {

    public static void requireNotEmpty(String str,String msg){
        if(str == null || "".equals(str)){
             throw new IllegalArgumentException(msg);
        }
    }
    public static String generate32Byte(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }

}
