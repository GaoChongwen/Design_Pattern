package propComp.PropDir;

import base.Item;

import java.util.ArrayList;
import java.util.List;

public class Node extends PropDir {
    private String nodeName;
    protected int type = 0;
    List<PropDir> nodeList = new ArrayList<PropDir>();//内部节点列表（包括文件和下级目录）
    //通过构造器为当前目录节点赋名
    public Node(String name) {
        super(name);
        nodeName = name;
    }

    public boolean isNode(){
        return true;
    }
    public String getNodeName(){
        return this.nodeName;
    }


    //新增节点
    public void addNode(Node node){
        //System.out.print("SSEW");
        nodeList.add(node);
    }
    public void addNode(Filer filer) {
        //System.out.print("SSEW");
        nodeList.add(filer);
    }
}
