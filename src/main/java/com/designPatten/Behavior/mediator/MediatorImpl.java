package com.designPatten.Behavior.mediator;

/*'
    中介者实现类
 */
public class MediatorImpl extends Mediator{

    @Override
    public void do1() {
        super.c1.selfMethod();
        super.c2.selfMethod();
    }

    @Override
    public void do2() {
        super.c1.depenceMethod();
        super.c2.depenceMethod();
    }
}
