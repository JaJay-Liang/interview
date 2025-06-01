package com.designPatten.Struct.decoator;

/**
 * 装饰者
 */
public class DecoratorClient {
    public static void main(String[] args) {

        Component concreteCom = new ConcreteCom();

        //因为多态，进过两个装饰者修饰后，返回的其实还是自身的operator的方法，在装饰者中对改方法进行了增强
        concreteCom = new DecoratorA(concreteCom);
        concreteCom = new DecoratorB(concreteCom);

        concreteCom.operate();


    }

}
