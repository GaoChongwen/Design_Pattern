package base.animal;


import base.FarmObj;

import java.util.Observable;
import java.util.Observer;

public class Animal extends FarmObj implements Observer {

    protected AnimalState babyState;
    protected AnimalState growingState;
    protected AnimalState matureState;
    protected AnimalState state;
    protected boolean isMature;
    protected int stockPrice;
    protected int salePrice;

    public Animal(){
        this.typename ="Animal";
        babyState=new BabyState(this);
        growingState=new GrowingState(this);
        matureState=new MatureState(this);
        this.state=babyState;
        isMature=false;
        stockPrice=0;
        salePrice=0;
    }

    public boolean isMature() {
        return isMature;
    }

    public void setMature(boolean mature) {
        isMature = mature;
    }

    public AnimalState getState() {
        return state;
    }

    public void setState(AnimalState state) {
        this.state = state;
    }

    @Override
    public void update(Observable o, Object arg) {  //粒度是否太细？用animal当观察者还是用animalHouse当观察者还有待商榷
        this.grow();
    }

    private void grow(){
        this.state.grow();
    }
}
