package com.designPatten.Struct.corp;

/**
 * 组合模式
 */
public class CorpClient {

    public static void main(String[] args) {
        Branch root = new Branch("root","1");
        Branch root2 = new Branch("root2","2");
        Branch root3 = new Branch("root3","3");


        Leaf l1 = new Leaf("l1","1");
        Leaf l2 = new Leaf("l2","1");
        Leaf l3 = new Leaf("l3","1");
        Leaf l4 = new Leaf("l4","1");
        Leaf l5 = new Leaf("l5","1");

        root.addSon(l1);
        root.addSon(root2);
        root.addSon(root3);

        root2.addSon(l2);
        root2.addSon(l3);

        root3.addSon(l4);
        root3.addSon(l5);


        String treeInfo = Client.getTreeInfo(root);
        System.out.println(treeInfo);

    }

}


