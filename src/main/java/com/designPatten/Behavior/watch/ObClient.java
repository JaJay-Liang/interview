package com.designPatten.Behavior.watch;

import java.util.Observable;
import java.util.Observer;

public class ObClient {

    public static void main(String[] args) {
        //java方式实现观察者模式(jdk9弃用)
        ob2 ob2 = new ob2();
        Observer observer = new ob1("A");
        Observer observer2 = new ob1("B");
        Observer observer3 = new ob1("C");

        ob2.addObserver(observer);
        ob2.addObserver(observer2);
        ob2.addObserver(observer3);


        //进行通知
        ob2.method1();
        ob2.method2();

    }

}

class ob2 extends Observable{

    public void method1(){

        System.out.println("执行了方法一");
        super.setChanged();//需要通知
        super.notifyObservers("z执行");

    }

    public void method2(){

        System.out.println("执行了方法二");
        super.setChanged();//需要通知
        super.notifyObservers("z执行2");

    }

}


class ob1 implements Observer{

    private String name;

    public ob1(String name){
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("报告 "+ name + " observer 触发了update");

    }
}