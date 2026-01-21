package com.designPatten.Behavior.command;

public class Agroup extends Group{
    @Override
    public void add() {
        System.out.println("a组添加");
    }

    @Override
    public void delete() {
        System.out.println("a组删除");
    }
}
