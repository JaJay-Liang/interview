package com.designPatten.Struct.decoator;

/**
 * 抽象装饰者
 */

public abstract class Decorator extends Component {

    private Component _c;

    public Decorator(Component c){
        this._c = c;
    }

    @Override
    public void operate(){//委托给构件执行
        this._c.operate();
    }
}
