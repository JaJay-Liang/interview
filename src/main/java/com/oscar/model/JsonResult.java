package com.oscar.model;

import lombok.Data;

@Data
public class JsonResult<T> {

    private int code;
    private T data;
    private String msg;

    public static <T> JsonResult<T> success(T data){
        JsonResult<T> o = new JsonResult<>();
        o.setData(data);
        o.setCode(40001);
        return o;
    }

    public static <T> JsonResult<T> success(String msg,T data){
        JsonResult<T> o = new JsonResult<>();
        o.setMsg(msg);
        o.setData(data);
        o.setCode(40001);
        return o;
    }


}
