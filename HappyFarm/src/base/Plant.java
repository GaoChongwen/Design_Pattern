package base;

import utils.state.PlantState;

import java.util.Observable;
import java.util.Observer;

public class Plant extends FarmObj implements Observer{
    protected String name;
    protected PlantState state;
    protected int stockPrice;
    protected int salePrice;

    @Override
    public void update(Observable o, Object arg) {

    }
}
