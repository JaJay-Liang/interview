package com.designPatten.Behavior.visitor;

public class Element1 extends Element{
    @Override
    public void doSomething() {
        System.out.println("元素执行");
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
