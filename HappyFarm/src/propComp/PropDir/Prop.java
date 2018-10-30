package propComp.PropDir;

import base.Item;
import propComp.props.landAdaptor.AppleAdaptor;
import propComp.props.landAdaptor.CornAdaptor;
import propComp.props.landAdaptor.LandAdaptor;
import utils.test.Adaptor;

import java.io.File;

public class Prop {

    public static void createTree() {
        Node filer = new Node("Adaptor");
        Node node1 = new Node("Product");
        Root.getInstance().propDir.addNode(filer);
        Root.getInstance().propDir.addNode(node1);
    }
/*
    public static void createBranch(Node propDir) throws Exception{
        Filer node = new Filer("");
        Filer node1 = new Filer("Product");
        propDir.addNode(node);
        propDir.addNode(node1);
        //adapter PRODUCT
    }
    */
    public static void display(PropDir node){
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

    /*
    public static void addProduct(Product product){
       Node node = null;
        for (int i=0;i<Root.getInstance().propDir.nodeList.size();i++){
        if (Root.getInstance().propDir.nodeList.get(i).getName().equals("Product")){
            node = (Node)Root.getInstance().propDir.nodeList.get(i);
            break;
        }
    }
    Filer filer = new Filer(product.getName());
        filer.setItem(product);
        try {
        node.addNode(filer);
    }catch (Exception e){
        e.printStackTrace();
    }
    }
    */



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

    }
}
