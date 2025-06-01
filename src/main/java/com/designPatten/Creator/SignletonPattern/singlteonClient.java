package com.designPatten.Creator.SignletonPattern;

/*
    单例模式
    对象只有一个

 */
public class singlteonClient {

    public static void main(String[] args) {
        for (int i = 0; i < 1000000; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    SoBJECT signletonObj = SoBJECT.getSignletonObj();
                    System.out.println(signletonObj);
                }
            }).start();
        }
    }
}


class SoBJECT{

    //这里使用volatile 是为了方式在new 的方法里出现指令重排序
    public static volatile SoBJECT s;

    /**
     * 私有化无参构造，外部不能直接new
     */
    private SoBJECT(){

    }


    //双重检查锁
    public static SoBJECT getSignletonObj() {
        if (s == null) {
            synchronized (SoBJECT.class) {
                if (s == null) {
                    synchronized (SoBJECT.class) {
                        s = new SoBJECT();
                    }
                }
            }
        }
        return s;
    }
}
