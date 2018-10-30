package propComp.PropDir;

import base.Item;

public abstract class PropDir extends Item{
    protected String name;//名称
    //构造器赋名
    public PropDir(String name){
        this.name = name;
    }
    abstract boolean isNode();
    public String getNodeName(){
        return name;
    }

}
