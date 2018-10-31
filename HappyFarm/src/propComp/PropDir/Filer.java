package propComp.PropDir;

import base.FarmObj;
import base.Item;
import propComp.props.landAdaptor.LandAdaptor;

/**
 * @Design-Pattern: Composite Pattern
 * @description: Filer类 继承于PropDir 文件节点 存储Item类型实例
 * @version 2018/10/30
 * @author jihao luo
 *
 */

public class Filer extends PropDir {
    private Item item = null;


    public Filer(String name) {
        super(name);
    }


    public boolean isNode() {
        return false;
    }
    //显示文件节点


    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
