package com.designPatten.Struct.decoator;

public class DecoratorA extends Decorator{
    public DecoratorA(Component c) {
        super(c);
    }

    public void selfMethod(){
        System.out.println("装饰器A自身方法");
    }

    @Override
    public void operate(){
        this.selfMethod();
        super.operate();
    }

}
