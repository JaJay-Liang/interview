package com.designPatten.Behavior.visitor;

/**
 * 访问者模式
 * 在不改变元素本身的情况下，委托给外部访问者对内部元素进行计算访问执行
 */
public class VisitorClient {

    public static void main(String[] args) {

        VisitorImpl visitor = new VisitorImpl();

        Element1 element1 = new Element1();

        element1.accept(visitor);


    }

}
