package com.designPatten.Struct.corp;

import java.util.List;

public class Client {


    public static String getTreeInfo(Branch root){

        List<ICorp> iCorps = root.getsonInfo();

        for (ICorp iCorp : iCorps) {
            if (iCorp instanceof Branch){
                System.out.println("当前branch：" + iCorp.getInfo() + "-->" );
                System.out.println( getTreeInfo((Branch) iCorp));
            }else {
                System.out.println(iCorp.getInfo());
            }
        }


        return "";
    }

}
