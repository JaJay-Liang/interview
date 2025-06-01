package com.designPatten.Creator.builder;

/**
 * 建造者模式
 */
public class BuilderClient {

    public static void main(String[] args) {

        Director director = new Director();
        director.createProduct();

    }

}
