package com.designPatten.Behavior.mediator;

/*
    中介者模式

    两个同事之间的协作通过中介者来进行

    中介者容易臃肿产生类膨胀
 */
public class MediatorClient {

    public static void main(String[] args) {

        //创建中介者
        Mediator mediator = new MediatorImpl();

        //创建两个同事,并设置中介者
        ColleagueImpl colleague = new ColleagueImpl(mediator);
        ColleagueImpl2 colleague2 = new ColleagueImpl2(mediator);

        mediator.setC1(colleague);
        mediator.setC2(colleague2);


        //中介执行方法
        colleague.depenceMethod();


    }

}
