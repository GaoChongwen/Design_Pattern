package utils.test;

import building.farmland.AppleField;
import building.farmland.CornField;
import plant.Wheat;
import propComp.props.landAdaptor.AllAdaptor;
import utils.Context;

public class Adaptor {
    public static void main(String args[]){
        AllAdaptor allAdaptor = new AllAdaptor();
        AppleField appleField = new AppleField();
        CornField wheatField = new CornField();
        Wheat w = new Wheat();
        appleField.plant(w);

        appleField.use(allAdaptor);
        appleField.plant(w);
    }
}
