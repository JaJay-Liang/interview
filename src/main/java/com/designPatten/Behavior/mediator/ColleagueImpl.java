package com.designPatten.Behavior.mediator;

/**
 * 具体同事类
 */
public class ColleagueImpl extends Colleague{
    /**
     * 设置中介者
     */
    public ColleagueImpl(Mediator m) {
//        m.setC1(this);
        super(m);
    }


    public void selfMethod(){



        System.out.println("1自身方法，实际有自己执行");
        System.out.println("本类执行");

    }
    public void depenceMethod(){
        System.out.println("1依赖方法,实际是有中介者执行");
        super.mediator.do1();
    }


}
