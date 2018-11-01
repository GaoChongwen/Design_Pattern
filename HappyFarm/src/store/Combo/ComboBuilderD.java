package store.Combo;

import base.FarmObj;
import base.Item;
import base.plant.Plant;
import singleton.Farm;

import java.util.ArrayList;
import java.util.List;

public class ComboBuilderD extends Builder {
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
        product.setPlant("apple",3,100);
        product.setAdaptors("cornField",2,1000);
        product.setAnimals("cow",2,1000);
        product.setTotalPrice(4300);
    }

    @Override
    public Combo getCombo() {
        return product;
    }

}
