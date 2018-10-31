package propComp.PropDir;

import base.Item;

/**
 * @Design-Pattern: Composite Pattern
 * @description: PropDir类 继承于Item 区分Node和Filer两种类型节点
 * @version 2018/10/30
 * @author jihao luo
 *
 */
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
