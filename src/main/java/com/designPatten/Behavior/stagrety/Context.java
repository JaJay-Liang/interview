package com.designPatten.Behavior.stagrety;

/**
 * 上下文对象
 */
public class Context {

    private IStagrety stagrety;

    public Context(IStagrety stagrety){
        this.stagrety = stagrety;
    }

    public void doContext(){
        stagrety.exec();
    }
}
