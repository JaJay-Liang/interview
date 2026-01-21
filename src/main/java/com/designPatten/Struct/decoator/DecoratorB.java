package com.designPatten.Struct.decoator;

public class DecoratorB extends Decorator{
    public DecoratorB(Component c) {
        super(c);
    }

    public void selfMethod(){
        System.out.println("装饰器B自身方法");
    }

    @Override
    public void operate(){
        this.selfMethod();
        super.operate();
    }

}
