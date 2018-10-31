package test.builder;

import plant.Apple;
import plant.Cabbage;
import plant.Rice;
import plant.Wheat;
import singleton.Farm;
import store.Combo.Combo;
import store.Combo.ComboBuilderA;
import store.Combo.ComboBuilderB;
import store.Combo.Director;

/**
 * @author Wenyuan Li
 * @version 2018-10-31
 * Scenario: Dynamically combined into different combos
 */
public class Builder {
    public static void main(String args[]){
        Farm.getInstance().initialFarmObj();
        new Apple();
        new Wheat();
        new Cabbage();
        new Rice();
        Director director = new Director();
        store.Combo.Builder builderA = new ComboBuilderA();
        store.Combo.Builder builderB = new ComboBuilderB();

        director.ConstructBuild(builderA);
        Combo comboA = builderA.getCombo();
        comboA.showCombo();

        director.ConstructBuild(builderB);
        Combo comboB = builderB.getCombo();
        comboB.showCombo();
    }
}
