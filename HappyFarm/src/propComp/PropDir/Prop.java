package propComp.PropDir;

import base.Produce;
import propComp.props.landAdaptor.AppleAdaptor;
import propComp.props.landAdaptor.CornAdaptor;
import propComp.props.landAdaptor.LandAdaptor;

/**
 * @Design-Pattern: Singleton Pattern，Composite Pattern
 * @description: Prop类 用于生成工具箱结构
 * @version 2018/10/30
 * @author jihao luo
 *
 */

public class Prop {

    public static void createTree()
    //初始化工具箱 工具箱里两个包 一个是Adaptor 存放landadaptor类型 一个是Product 用于存放produce
    {
        Node filer = new Node("Adaptor");
        Node node1 = new Node("Product");
        Root.getInstance().propDir.addNode(filer);
        Root.getInstance().propDir.addNode(node1);
    }
    //初始化函数
/*
    public static void createBranch(Node propDir) throws Exception{
        Filer node = new Filer("");
        Filer node1 = new Filer("Product");
        propDir.addNode(node);
        propDir.addNode(node1);
        //adapter PRODUCT
    }
    */
    public static void display(PropDir node)
    //展示函数
    {
        if (node.isNode()) {
            Node node1 = (Node) node;
            for (int i = 0; i < node1.nodeList.size(); i++) {
                PropDir propDir = node1.nodeList.get(i);
                if (!propDir.isNode()){
                    Filer filer = (Filer)propDir;
                    System.out.println(filer.name);
                } else{
                    display(propDir);
                }
            }
        }
    }

    public static void CheckAndRemove(PropDir node)
    //在回合结束的时候遍历 去除所有已经使用过的道具
    {
        if (node.isNode()) {
            Node node1 = (Node) node;

            for (int i = 0; i < node1.nodeList.size(); i++) {
                PropDir propDir = node1.nodeList.get(i);
                if (!propDir.isNode()){
                    Filer filer = (Filer)propDir;
                    if (filer.getItem().getIsUsed()) filer.setItem(null);
                    System.out.println(filer.name);
                } else{
                    display(propDir);
                }
            }
        }
    }

    //按目录遍历 查找是否存在相关道具可以使用
    public static boolean checkNow(PropDir node,String name)
    {
        if (node.isNode()) {
            Node node1 = (Node) node;
            for (int i = 0; i < node1.nodeList.size(); i++) {
                PropDir propDir = node1.nodeList.get(i);
                if (!propDir.isNode()){
                    Filer filer = (Filer)propDir;
                    System.out.println(filer.name);
                    if (filer.name.equals(name))
                        return true;
                } else{
                    checkNow(propDir,name);
                }
            }
        }
        return false;
    }
    public boolean Check(String name){
        boolean flag = checkNow((PropDir)Root.getInstance().propDir,name);
        return flag;
    }


    //添加adaptor节点
    public static void addAdaptor(LandAdaptor adaptor){
        Node node = null;
        for (int i=0;i<Root.getInstance().propDir.nodeList.size();i++){
            if (Root.getInstance().propDir.nodeList.get(i).getNodeName().equals("Adaptor")){
                node = (Node)Root.getInstance().propDir.nodeList.get(i);
                break;
            }
        }
        Filer filer = new Filer(adaptor.getName());
        filer.setItem(adaptor);
        try {
            node.addNode(filer);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //添加product节点
    public static void addProduct(Produce product) {
        Node node = null;
        for (int i = 0; i < Root.getInstance().propDir.nodeList.size(); i++) {
            if (Root.getInstance().propDir.nodeList.get(i).getName().equals("Product")) {
                node = (Node) Root.getInstance().propDir.nodeList.get(i);
                break;
            }
        }
        Filer filer = new Filer(product.getName());
        filer.setItem(product);
        try {
            node.addNode(filer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        try {
            createTree();
        } catch (Exception e) {
            e.printStackTrace();
        }
        AppleAdaptor adaptor = new AppleAdaptor();
        CornAdaptor cornAdaptor = new CornAdaptor();
        //System.out.println(adaptor.getName());
        //System.out.println(Root.getInstance().propDir.nodeList.size());
        addAdaptor(adaptor);
        addAdaptor(cornAdaptor);
        display((PropDir)Root.getInstance().propDir);

        Prop prop = new Prop();
        prop.createTree();
        //AppleAdaptor adaptor = new AppleAdaptor();
        //CornAdaptor cornAdaptor = new CornAdaptor();
        prop.addAdaptor(adaptor);
        prop.addAdaptor(cornAdaptor);
        prop.display((PropDir) Root.getInstance().propDir);


    }
}
