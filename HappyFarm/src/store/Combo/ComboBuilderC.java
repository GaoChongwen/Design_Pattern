package store.Combo;

import base.FarmObj;
import base.Item;
import base.plant.Plant;
import singleton.Farm;

import java.util.ArrayList;
import java.util.List;

public class ComboBuilderC extends Builder {
    private Combo product = new Combo();

    @Override
    public void buildComboName() {
        product.setComboName("ComboC");
    }

    @Override
    public void build() {
        /**
         * 在这里添加套餐内的东西
         */
        Farm.getInstance().initialFarmObj();
        product.setPlant("apple",2,100);
        product.setAdaptors("vegtbField",1,1000);
        product.setAnimals("chicken",2,1000);
        product.setTotalPrice(3200);
    }

    @Override
    public Combo getCombo() {
        return product;
    }

}
