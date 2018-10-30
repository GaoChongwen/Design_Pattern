package propComp.PropDir;

import base.FarmObj;
import base.Item;
import propComp.props.landAdaptor.LandAdaptor;

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
