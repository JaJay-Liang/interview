package com.designPatten.Struct.corp;

import java.util.ArrayList;
import java.util.List;

public class Branch extends ICorp{

    public Branch(String s1,String s2){
           super(s1,s2);
    }


    List<ICorp> sonList = new ArrayList<>();

    public void addSon(ICorp c){
        sonList.add(c);
    }

    public List<ICorp> getsonInfo(){
        return sonList;

    }


}
