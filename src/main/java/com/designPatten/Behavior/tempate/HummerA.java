package com.designPatten.Behavior.tempate;

public class HummerA extends HummerModel{

    @Override
    public void start() {
        System.out.println("悍马a启动");
    }

    @Override
    public void stop() {
        System.out.println("悍马a停止");
    }

    @Override
    public void alarm() {
        System.out.println("悍马a警告");
    }


    private boolean alarmFlag = true;

    public void setAlarm(boolean flag){
        this.alarmFlag = flag;
    }

    //调用钩子方法
    @Override
    protected boolean isAlarm() {
        return this.alarmFlag;
    }
}
