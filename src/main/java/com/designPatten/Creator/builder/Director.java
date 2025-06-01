package com.designPatten.Creator.builder;

/**
 * 导演类，对builder的更一层封装，避免直接访问builder
 */
public class Director {

    private Builder builder = new BuilderImpl();

    public  Product createProduct(){
        builder.setPart();
        return builder.buildProduct();

    }

}
