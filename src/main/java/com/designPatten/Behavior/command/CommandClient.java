package com.designPatten.Behavior.command;

/**
 * 命令模式
 * 调用者执行被封装的命令逻辑，只要继承了command类，并重写execute方法
 */
public class CommandClient {

    public static void main(String[] args) {
        StartCommand startCommand = new StartCommand();

        StopCommand stopCommand = new StopCommand();

        Invoker invoker = new Invoker(startCommand);
        invoker.exec();


        invoker =  new Invoker(stopCommand);
        invoker.exec();

    }

}
