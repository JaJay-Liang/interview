package com.designPatten.Struct.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyClient {

    public static void main(String[] args) {

        //分别使用jdk 和 cglib 代理实现 火车站买票过程
        ProxyFactory proxyFactory = new ProxyFactory();

        //基于接口增强
        SellTicket jdkProxy = proxyFactory.getJDKProxy();
        jdkProxy.sell();

        //基于继承增强
        TStation libProxy = proxyFactory.getcgLibProxy();
        libProxy.sell();


    }

}

//代理工厂
class ProxyFactory implements MethodInterceptor {

    //这个station的作用是method时，需要处理的对象
    TStation station = new TStation();

    //jdk代理(对实现了SellTicket接口的station进行代理 sellticket为代理对象)
    public SellTicket getJDKProxy(){
        SellTicket o = (SellTicket)Proxy.newProxyInstance(
                station.getClass().getClassLoader(),
                station.getClass().getInterfaces(),//需要实现接口的原因
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("进入jdk车站");
                        Object invoke = method.invoke(station, args);
                        return invoke;
                    }
                }
        );
        return o;
    }

    //cglib代理
    public TStation getcgLibProxy(){

        Enhancer enhancer = new Enhancer();

        enhancer.setSuperclass(TStation.class);

        enhancer.setCallback(this); //cglib需要实现MethodInterceptor，功能在intercept中进行增强

        TStation o = (TStation)enhancer.create();

        return o;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cgLib车站开始买票");
        Object res = method.invoke(station, objects);
        return res;
    }
}


interface SellTicket{
    void sell();
}


class TStation implements SellTicket{

    public void sell() {
        System.out.println("进行买票");
    }
}
