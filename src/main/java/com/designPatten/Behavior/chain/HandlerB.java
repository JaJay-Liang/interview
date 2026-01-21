package com.designPatten.Behavior.chain;

import lombok.Data;

@Data
public class HandlerB extends IHandler{
    public HandlerB(){
        super(LEVEL_B,"B");

    }

    @Override
    protected String exec(Integer level) {
        System.out.println("B执行");
        return "B";
    }
}
