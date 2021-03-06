package store.Combo;

import base.FarmObj;
import base.Item;
import base.plant.Plant;

import java.util.ArrayList;
import java.util.List;

public class ComboBuilderB extends Builder {
    private Combo product = new Combo();

    @Override
    public void buildComboName() {
        product.setComboName("ComboB");
    }

    @Override
    public void build() {
        /**
         * 在这里添加套餐内的东西
         */
        product.setPlant("wheat",1,1);
        product.setAdaptors("appleField",2,10);
        product.setAnimals("cow",1,10);
        product.setTotalPrice(31);
    }

    @Override
    public Combo getCombo() {
        return product;
    }

}
