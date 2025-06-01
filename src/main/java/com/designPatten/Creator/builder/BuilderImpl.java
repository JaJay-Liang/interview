package com.designPatten.Creator.builder;


public class BuilderImpl extends Builder {

    private Product product = new Product();

    @Override
    public void setPart() {
        product.doSomething();
        System.out.println("建造者实现类进行设置");
    }

    @Override
    public Product buildProduct() {
        return product;
    }
}
