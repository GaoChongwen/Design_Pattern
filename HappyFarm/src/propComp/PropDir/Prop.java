package propComp.PropDir;

import base.Produce;
import propComp.props.landAdaptor.AppleAdaptor;
import propComp.props.landAdaptor.CornAdaptor;
import propComp.props.landAdaptor.LandAdaptor;

/**
 * @Design-Pattern: Singleton Pattern，Composite Pattern
 * @description: Prop类 用于生成工具箱结构
 * @version 2018/11/01
 * @author pengcheng he
 */

public class Prop {

    public static void createTree()
    //初始化工具箱 工具箱里两个包 一个是Adaptor 存放landadaptor类型 一个是Product 用于存放produce
    {
        Node filer = new Node("Adaptor");
        Node node1 = new Node("Product");
        Root.getInstance().propDir.addNode(filer);
        Root.getInstance().propDir.addNode(node1);
        Root.initialize();
    }

    public static boolean checkInitialization(){
        if (!Root.isInitialized()){
            System.out.println("operate prop dir without initialization.");
            System.out.println("initialize the prop dir automatically.");
            createTree();
            return false;
        }else{
            return true;
        }
    }

    public static void display(PropDir node)
    //展示函数
    {
        if (!checkInitialization()){
            System.out.println("empty prop dir");
            return;
        }

        if (node.isNode()) {
            Node node1 = (Node) node;
            for (int i = 0; i < node1.nodeList.size(); i++) {
                PropDir propDir = node1.nodeList.get(i);
                if (!propDir.isNode()){
                    Filer filer = (Filer)propDir;
                    if(!filer.isNull()){
                        System.out.println(node.name+" "+filer.name);
                    }
                } else{
                    display(propDir);
                }
            }
        }
    }

    // 展示adaptor包
    public static void displayAdaptor(){
        if (!checkInitialization()){
            System.out.println("empty prop dir");
            return;
        }

        Node adaptor = null;
        for (int i = 0; i<Root.getInstance().propDir.nodeList.size(); i++){
            if(Root.getInstance().propDir.nodeList.get(i).getNodeName().equals("Adaptor")){
                adaptor = (Node) Root.getInstance().propDir.nodeList.get(i);
                display(adaptor);
            }
        }
    }

    // 展示produce包
    public static void displayProduct(){
        if (!checkInitialization()){
            System.out.println("empty prop dir");
            return;
        }

        Node product = null;
        for (int i=0; i<Root.getInstance().propDir.nodeList.size(); i++){
            if(Root.getInstance().propDir.nodeList.get(i).getNodeName().equals("Product")){
                product = (Node)Root.getInstance().propDir.nodeList.get(i);
                display(product);
            }
        }
    }

    public static void CheckAndRemove(PropDir node)
    //在回合结束的时候遍历 去除所有已经使用过的道具
    {
        if(!checkInitialization()){
            System.out.println("empty, no check and remove done");
            return;
        }

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
        if(!checkInitialization()){
            System.out.println("empty, no check done");
            return false;
        }

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

    public static boolean Check(String name){
        if(!checkInitialization()){
            System.out.println("empty, no check done");
            return false;
        }
        boolean flag = checkNow((PropDir)Root.getInstance().propDir,name);
        return flag;
    }


    //添加adaptor节点
    public static void addAdaptor(LandAdaptor adaptor){
        if (!Root.isInitialized()){
            createTree();
            System.out.println("create tree automatically");
        }

        Node node = null;
        for (int i=0;i<Root.getInstance().propDir.nodeList.size();i++){
            if (Root.getInstance().propDir.nodeList.get(i).getNodeName().equals("Adaptor")){
                node = (Node)Root.getInstance().propDir.nodeList.get(i);
                break;
            }
        }

        // 查找空filer节点
        // 将adaptor存入空节点
        for(int i = 0; i<node.nodeList.size(); i++){
            if(!node.nodeList.get(i).isNode()){
                Filer filer = (Filer)node.nodeList.get(i);
                if(filer.isNull()){
                    filer.setItem(adaptor);
                    return;
                }
            }
        }

        // 没有空filer节点
        // 将adaptor加入新的filer节点，加入队列
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
        if (!Root.isInitialized()){
            createTree();
            System.out.println("create tree automatically");
        }

        Node node = null;
        int t = Root.getInstance().propDir.nodeList.size();
        for (int i = 0; i < Root.getInstance().propDir.nodeList.size(); i++) {
            if (Root.getInstance().propDir.nodeList.get(i).getNodeName().equals("Product")) {
                node = (Node) Root.getInstance().propDir.nodeList.get(i);
                break;
            }
        }

        // 查找空的filer节点
        for(int i = 0; i<node.nodeList.size(); i++){
            if(!node.isNode()){
                Filer filer = (Filer)node.nodeList.get(i);
                if(filer.isNull()){
                    filer.setItem(product);
                    return;
                }
            }
        }

        // 没有空的filer节点
        // 将product加入到新的filer节点中，加入队列
        Filer filer = new Filer(product.getName());
        filer.setItem(product);
        try {
            node.addNode(filer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
