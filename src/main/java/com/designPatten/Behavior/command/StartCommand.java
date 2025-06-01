package com.designPatten.Behavior.command;

/**
 * 启动命令
 */
public class StartCommand extends Command{
    @Override
    public void execute() {
        System.out.println("执行启动 a 添加 ， b添加");

        super.a.add();
        super.b.add();

    }
}
