package base;

import utils.state.AnimalState;

import java.util.Observable;
import java.util.Observer;

public class Animal extends FarmObj implements Observer {
    protected AnimalState state;
    protected int stockPrice;
    protected int salePrice;

    @Override
    public void update(Observable o, Object arg) {

    }
}
