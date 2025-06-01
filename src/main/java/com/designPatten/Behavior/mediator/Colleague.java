package com.designPatten.Behavior.mediator;

/*
    抽象同事类
 */
public abstract class Colleague {

    protected Mediator mediator;

    /**
     * 设置对于的中介者
     */
    public Colleague(Mediator m){
        this.mediator = m;
    }

}
