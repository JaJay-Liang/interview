package com.designPatten.Behavior.mediator;

import lombok.Data;

/*
    抽象中介者
 */
@Data
public abstract class Mediator {

    //这里是具体的实现类？耦合严重
    protected ColleagueImpl c1 ;
    protected ColleagueImpl2 c2 ;

    public abstract void do1();
    public abstract void do2();



}
