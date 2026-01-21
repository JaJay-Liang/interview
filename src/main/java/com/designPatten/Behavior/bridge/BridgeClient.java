package com.designPatten.Behavior.bridge;

/**
 * 桥接模式，桥梁模式
 *
 * 重点在解耦上
 */
public class BridgeClient {
    public static void main(String[] args) {
        Implementor implA = new ImplA();

        RefinedAbs refinedAbs = new RefinedAbs(implA);

        refinedAbs.request();

    }

}
