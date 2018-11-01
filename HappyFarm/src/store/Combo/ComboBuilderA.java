package store.Combo;

import base.FarmObj;
import base.Item;
import base.plant.Plant;
import singleton.Farm;

import java.util.ArrayList;
import java.util.List;

public class ComboBuilderA extends Builder {
    private Combo product = new Combo();

    @Override
    public void buildComboName() {
        product.setComboName("套餐A");
    }

    @Override
    public void build() {
        /**
         * 在这里添加套餐内的东西
         */
        Farm.getInstance().initialFarmObj();
        product.setPlant("rice",2,1);
        product.setAdaptors("vegtbField",1,10);
        product.setAnimals("chicken",1,10);
        product.setTotalPrice(22);
    }

    @Override
    public Combo getCombo() {
        return product;
    }

}
