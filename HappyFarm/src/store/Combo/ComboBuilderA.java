package store.Combo;

import base.Item;

import java.util.ArrayList;
import java.util.List;

public class ComboBuilderA extends Builder {
    private Combo product = new Combo();

    @Override
    public void buildComboName() {
        product.setComboName("套餐A");
    }

    @Override
    public void buildCommodity() {
        List<Item> principalItem = new ArrayList<Item>();
        /**
         * 在这里添加套餐内的商品
         */
        product.setCommodity(principalItem);
    }

    @Override
    public Combo getCombo() {
        return product;
    }

}
