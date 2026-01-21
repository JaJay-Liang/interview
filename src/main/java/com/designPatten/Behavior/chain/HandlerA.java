package com.designPatten.Behavior.chain;

import lombok.Data;

@Data
public class HandlerA extends IHandler{


    public HandlerA(){
        super(LEVEL_A,"A");

    }

    @Override
    protected String exec(Integer level) {
        System.out.println("A执行");
        return "A";
    }

}
