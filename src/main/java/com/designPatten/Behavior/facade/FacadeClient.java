package com.designPatten.Behavior.facade;

/**
 * 外观模式，蒙面模式
 * 简单的聚合组合
 */
public class FacadeClient {

    public static void main(String[] args) {
        Facade facade = new Facade();

        facade.doA();
    }

}


class A{

    public void doA(){
        System.out.println("执行A");
    }

}


class B{
    public void doB(){
        System.out.println("执行b");
    }

}

class Facade{

    private A a = new A();
    private B b = new B();

    public void doA(){
        a.doA();
    }

    public void doB(){
        b.doB();
    }

}


