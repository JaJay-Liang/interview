package com.designPatten.Behavior.stagrety;

/*
    策略模式
    和命令模式有点像

    区别是这个是接口
    命令模式是抽象父类，
 */
public class StagretyClient {

    public static void main(String[] args) {

        Context context = new Context(new StragretyA());
        context.doContext();

        new Context(new StragretyB()).doContext();


    }

}
