package com.designPatten.Creator.protoType;

import java.util.ArrayList;
import java.util.List;

/*
    原型模式
    拓展：深拷贝和浅拷贝，对引用对象的赋值需要留意

    List<Integer> oldList = new ArrayList<>();

    浅拷贝
    List<Integer> newList = oldList;

    深拷贝
     List<Integer> newList = new ArrayList<>(oldList);

 */
public class ProtoClient implements Cloneable{

    public static void main(String[] args) throws CloneNotSupportedException {

        //使用obj的clone方法进行复制
        ProtoType protoType = new ProtoType();

        ProtoType clone = protoType.clone();//clone方法不会执行构造函数

        System.out.println("原型：" + protoType);
        System.out.println("克隆：" + clone);

    }


}


class ProtoType implements Cloneable{

    public ProtoType(){
        System.out.println("原型模式构造函数被执行");
    }

    @Override
    public ProtoType clone() throws CloneNotSupportedException {
        //需要重写clone方法，因为父类的clone是prototed修饰
        return (ProtoType)super.clone();
    }

}
