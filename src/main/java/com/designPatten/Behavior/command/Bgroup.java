package com.designPatten.Behavior.command;

public class Bgroup extends Group {
    @Override
    public void add() {
        System.out.println("b组添加");
    }

    @Override
    public void delete() {
        System.out.println("b组删除");
    }
}
