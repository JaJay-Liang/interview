package com.designPatten.Behavior.command;

/**
 * 停止命令
 */
public class StopCommand extends Command{
    @Override
    public void execute() {
        System.out.println("执行停止");
        super.a.delete();
        super.b.delete();

    }
}
