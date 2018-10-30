package store.Combo;

import base.FarmObj;
import base.Item;
import base.plant.Plant;

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
        product.setPlant("white",1,1);
        product.setAdaptors("ad",1,10);
        product.setAnimals("pig",1,10);
        product.setTools("test",1,1);
        product.setEmployees();
    }

    @Override
    public Combo getCombo() {
        return product;
    }

}
