package com.designPatten.Struct.corp;

public abstract class ICorp {

    private String name = "";
    private String pos = "";

    public ICorp(String s1,String s2){
        this.name = s1;
        this.pos = s2;
    }

    public String getInfo(){
        return  "name:"+name + ",pos:" + pos ;
    }

}
