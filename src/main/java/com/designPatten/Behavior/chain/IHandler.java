package com.designPatten.Behavior.chain;

import lombok.Data;

@Data
public abstract class IHandler {

    private IHandler next;
    private Integer level;
    private String name;


    public static final Integer LEVEL_A = 1;
    public static final Integer LEVEL_B = 2;
    public static final Integer LEVEL_C = 3;

    public IHandler(){}

    public IHandler(Integer level,String name){
        this.level = level;
        this.name = name;
    }

    protected abstract String exec(Integer level);

      String handle(Integer level){
             if (level > this.level){//交给下一个执行
                 if (next == null){
                     System.out.println("后续无人处理了");
                     return null;
                 }
                 return next.handle(level);
             }else {
                 exec(level);
                 System.out.println(name+"执行了这个level:" + level);
                 return "B";
             }
         }

}
