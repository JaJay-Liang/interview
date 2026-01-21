package com.designPatten.Behavior.command;

public class Invoker {

    private Command c ;

    public Invoker(Command c){
        this.c = c;
        System.out.println("invoke 命令执行");
    }

    public void exec(){
        c.execute();
    }

}
