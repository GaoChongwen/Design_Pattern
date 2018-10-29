package utils.test;

import building.farmland.AppleField;
import plant.Wheat;
import propComp.props.landAdaptor.AllAdaptor;
import utils.Context;

public class Adaptor {
    public static void main(String args[]){
        AllAdaptor allAdaptor = new AllAdaptor();
        AppleField appleField = new AppleField();
        Wheat w = new Wheat(Context.wheat_stockPrice,Context.wheat_salePrice);
        appleField.plant(w);

        allAdaptor.use(appleField);

        appleField.plant(w);
    }
}
