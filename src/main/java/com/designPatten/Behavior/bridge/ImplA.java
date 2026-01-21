package com.designPatten.Behavior.bridge;

public class ImplA implements Implementor{
    @Override
    public void doSome() {
        System.out.println("do some");
    }

    @Override
    public void doAny() {
        System.out.println("do any");
    }
}
