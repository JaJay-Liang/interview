package com.designPatten.Behavior.mediator;

/**
 * 具体同事类
 */
public class ColleagueImpl2 extends Colleague{
    /**
     * 设置中介者
     */
    public ColleagueImpl2(Mediator m) {
        super(m);
    }



    public void selfMethod(){
        System.out.println("2自身方法，实际有自己执行");
        System.out.println("本类执行");

    }
    public void depenceMethod(){
        System.out.println("1依赖方法,实际是有中介者执行");
        super.mediator.do1();

    }


}
