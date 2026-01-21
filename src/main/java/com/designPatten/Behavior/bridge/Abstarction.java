package com.designPatten.Behavior.bridge;

public abstract class Abstarction {

    private Implementor imp;

    public Abstarction(Implementor imp){
        this.imp = imp;

    }


    public void request(){
        imp.doSome();;
    }

    public Implementor getImp(){
        return imp;
    }

}
