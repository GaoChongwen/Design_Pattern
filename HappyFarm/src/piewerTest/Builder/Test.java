package piewerTest.Builder;

import plant.Apple;
import plant.Cabbage;
import plant.Rice;
import plant.Wheat;
import singleton.Farm;
import store.Combo.*;

public class Test {
    public static void main(String args[]){
        Farm.getInstance().initialFarmObj();
        Director director = new Director();
        store.Combo.Builder builderC = new ComboBuilderA();
        store.Combo.Builder builderD = new ComboBuilderD();

        director.ConstructBuild(builderC);
        Combo comboC = builderC.getCombo();
        comboC.showCombo();

        director.ConstructBuild(builderD);
        Combo comboD = builderD.getCombo();
        comboD.showCombo();
    }
}
