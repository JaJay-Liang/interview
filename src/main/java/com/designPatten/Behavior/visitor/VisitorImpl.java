package com.designPatten.Behavior.visitor;

public class VisitorImpl implements IVisitor{

     VisitorImpl(){

    }

    @Override
    public void visit(Element1 e1) {
        //访问元素
        e1.doSomething();

    }
}
