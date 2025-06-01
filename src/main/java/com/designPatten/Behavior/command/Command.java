package com.designPatten.Behavior.command;

/**
 * 抽象命令
 */
public abstract class Command {

    public Group a = new Agroup();
    public Group b = new Bgroup();

    public abstract void execute();

}
