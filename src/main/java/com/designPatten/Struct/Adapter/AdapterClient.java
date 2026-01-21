package com.designPatten.Struct.Adapter;

import lombok.Data;

/*
    适配者模式
 */
public class AdapterClient {

    public static void main(String[] args) {
        Chi chi = new Chi();
        Standrad eur = new Eur();


        Standrad chiAd = new AdapterImpl(chi);
        chiAd.ele();

        Standrad impl2 = new AdapterImpl2();
        impl2.ele();


    }

}

/*
    转换器2，类适配器
 */
class AdapterImpl2 extends Chi implements Standrad{

    @Override
    public void ele() {
        //在这里转为欧标？？转对应的实现类
        super.eleChi();
    }
}


/*
    转换器实现类，相当于对in的装饰转换，对象适配器
 */
class AdapterImpl implements Standrad{

    public Chi chi;

    public AdapterImpl(Chi chi){
        this.chi = chi;
    }

    @Override
    public void ele() {

        //在这里转为欧标？？转对应的实现类

        chi.eleChi();
    }
}


/*
    转换器
 */
class Adapter{
    public void doSomething(){
        System.out.println("adapter");
    }
}


interface Standrad{
    void ele();
}


/*
    国标
 */
@Data
class Chi {

    private String name = "220V" ;

    public void eleChi() {
        System.out.println("国标:" + name);
    }
}



/*
    欧标
 */
@Data
class Eur implements Standrad {

    private String name = "520V" ;

    public void ele() {
        System.out.println("欧洲");
    }
}
