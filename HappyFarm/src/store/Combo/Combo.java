package store.Combo;

import base.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * 暂时只支持添加商品作为套餐，即Item
 * 是否需要show方法
 */
public class Combo {
    private String comboName;
    List<Item>  commodity= new ArrayList<Item>();

    public String getComboName(){
        return comboName;
    }
    public void setComboName(String comboName) {
        this.comboName = comboName;
    }
    public void setCommodity(List<Item> commodity){
        for (Item item:commodity
             ) {
            this.commodity.add(item);
        }
    }
    public List<Item> getCommodity(){
        return commodity;
    }

}
