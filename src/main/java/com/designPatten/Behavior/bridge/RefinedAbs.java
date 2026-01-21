package com.designPatten.Behavior.bridge;

public class RefinedAbs extends Abstarction{
    public RefinedAbs(Implementor imp) {
        super(imp);
    }


    @Override
    public void request(){

        //抽象角色的部分实现是由实现类进行的，比如这里的doAny是直接调用的
        super.request();
        super.getImp().doAny();

    }

}
