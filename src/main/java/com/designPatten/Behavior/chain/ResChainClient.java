package com.designPatten.Behavior.chain;

/**
 * 责任链模式
 */
public class ResChainClient {

    public static void main(String[] args) {

        IHandler first = getFirstHandler();

        //责任链执行
        first.handle(5);

        //直接执行
        first.exec(4);


        //to do 需要一个client对handler进行封装，并直接返回第一个
    }


    public static IHandler getFirstHandler() {
        HandlerA handlerA = new HandlerA();
        HandlerB handlerB = new HandlerB();
        HandlerC handlerC = new HandlerC();

        handlerA.setNext(handlerB);
        handlerB.setNext(handlerC);
        return handlerA;
    }


}
