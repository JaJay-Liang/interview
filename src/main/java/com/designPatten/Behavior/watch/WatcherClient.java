package com.designPatten.Behavior.watch;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/*
    观察者模式，一对多
    发布-订阅模式
 */
public class WatcherClient {

    public static void main(String[] args) throws InterruptedException {


        //案例：微信工作号发布消息时，将该消息推送到所有关注该公众号的账号
        SubscriptionSubject subscriptionSubject = new SubscriptionSubject();
        WeiXinUser weiXinUser = new WeiXinUser("用户一");
        WeiXinUser weiXinUser2 = new WeiXinUser("用户二");
        //添加关注
        subscriptionSubject.attech(weiXinUser);
        subscriptionSubject.attech(weiXinUser2);
        //发布消息-推模式
        subscriptionSubject.notifytach("这里是第一次发送消息");


        //发布消息-拉模式
        //消费者主动进行获取
        weiXinUser.subscribe(subscriptionSubject);
        weiXinUser2.subscribe(subscriptionSubject);

        subscriptionSubject.notifytachFetch("这里是第二次发送消息");

        //开启拉取
        new Thread(new Runnable() {
            @Override
            public void run() {
                weiXinUser.fetch();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                weiXinUser2.fetch();
            }
        }).start();


        Thread.sleep(1000);

        subscriptionSubject.notifytachFetch("这里是第三次发送消息");

    }

}


/*
    具体观察者角色类
 */
@Data
class WeiXinUser implements ObServer{

    public WeiXinUser(String name){
        this.name = name;
    }

    private String name;

    //这里相当于订阅的主题列表
    private List<SubscriptionSubject> subjectList = new ArrayList<>();

    @Override
    public void uodate(String msg) {
        System.out.println("接受到消息了");
    }

    //订阅
    @Override
    public void subscribe(Subject s) {
        subjectList.add((SubscriptionSubject)s);
    }


    //拉模式
    @Override
    public void fetch() {
        System.out.println(11);
        while(true){
            for (SubscriptionSubject subject : subjectList) {
//                System.out.println(22);
                if (subject.hasNewMsg()){
                    System.out.println(name + "检查到有新消息输出：" + subject.getAmsg());
                    //将其newMsg置为false表示已经获取过了
                    subject.hasConsumer();
                }
            }
        }
    }


}



/*
    具体主题角色类
 */
@Data
class SubscriptionSubject implements Subject{

    private List<ObServer> weixinUserList = new ArrayList<>();

    private boolean newMsg = false;
    private String amsg;

    @Override
    public void attech(ObServer o) {
        weixinUserList.add(o);
    }

    @Override
    public void detach(ObServer o) {
        weixinUserList.remove(o);
    }

    @Override
    public void notifytach(String msg) {
        //将该消息进行通知
        for (ObServer obServer : weixinUserList) {
            obServer.uodate(msg);
        }
    }

    public void notifytachFetch(String msg) {
        //拉模式，每个单独的obServer在一个while循环中中不断轮询检查消息是否发生了改变
        newMsg = true;
        amsg = msg;
    }

    public boolean hasNewMsg(){
        return newMsg;
    }

    public void hasConsumer(){
        newMsg = false;
    }

}



/*
    观察者接口
 */
interface ObServer{
    void uodate(String msg);

    void fetch();

    void subscribe(Subject s);
}

/*
    抽象主题接口
 */
interface Subject{

    void attech(ObServer o);

    void detach(ObServer o);

    void notifytach(String msg);

}