package com.designPatten.Behavior.tempate;

/**
 * 模板方法模式
 */
public class TempleteClient {
    public static void main(String[] args) {
        HummerA hummerA = new HummerA();
        hummerA.setAlarm(false);
        hummerA.run();

    }

}
