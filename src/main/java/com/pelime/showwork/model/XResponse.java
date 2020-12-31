package com.pelime.showwork.model;

import java.util.HashMap;
import java.util.Map;

public class XResponse extends HashMap<String,Object> {

    public XResponse data(Map<String,Object> date){
        this.putAll(date);
        return this;
    }
    public XResponse(int code,String msg,String error){
        this.put("status",code);
        this.put("msg",msg);
        this.put("error",error);
    }

    public static XResponse success(String msg){
        return new XResponse(200,msg,"");
    }

    public static XResponse fail(int code,String err){
        return new XResponse(code,"",err);
    }
}
