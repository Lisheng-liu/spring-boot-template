package com.lls.config.aspect;

import java.util.HashMap;

public class ReturnMsg extends HashMap<String,Object> {

   public static final String CODE = "code";
   public static final String MSG = "msg";
   public static final String DATA = "data";

   public static  final String SUCCESS="100200";
    public static  final String FAILED="100201";

    public static ReturnMsg createSuccess(){
        ReturnMsg returnMsg = new ReturnMsg();
        returnMsg.put(CODE,SUCCESS);
        returnMsg.put(MSG,"操作成功");
        return returnMsg;
    }

    public static ReturnMsg createFail(){
        ReturnMsg returnMsg = new ReturnMsg();
        returnMsg.put(CODE,FAILED);
        returnMsg.put(MSG,"操作失败");
        return returnMsg;
    }

    public  ReturnMsg success(String msg){
        this.put(CODE,SUCCESS);
        this.put(MSG,msg);
        return this;
    }

    public  ReturnMsg fail(String msg){
        this.put(CODE,FAILED);
        this.put(MSG,msg);
        return this;
    }
    public <T> ReturnMsg data(T data){
        this.put(DATA,data);
        return this;
    }

}
