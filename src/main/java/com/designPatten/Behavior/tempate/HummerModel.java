package com.designPatten.Behavior.tempate;

public abstract class HummerModel {

    public abstract void start();
    public abstract void stop();
    public abstract void alarm();


    //将方法的执行顺序放入到抽象父类中
    public void run(){
        start();

        if (this.isAlarm()){
            alarm();
        }
        stop();
    }


    /**
     * 钩子方法
     * @return
     */
    protected boolean isAlarm(){
        return true;
    }

}
