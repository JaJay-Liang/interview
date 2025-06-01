package com.designPatten.Behavior.chain;

import lombok.Data;

@Data
public class HandlerC extends IHandler{
    private Integer level = 3;
    public HandlerC(){
        super(LEVEL_C,"C");

    }
    @Override
    protected String exec(Integer level) {
        System.out.println("c执行");
        return "c";
    }
}
