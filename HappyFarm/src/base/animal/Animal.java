package base.animal;


import base.FarmObj;

public class Animal extends FarmObj {

    //动物的状态
    protected AnimalState babyState;
    protected AnimalState growingState;
    protected AnimalState matureState;
    protected AnimalState deadState;
    protected AnimalState state;

    protected int stockPrice;  //进价
    protected int salePrice; //出价

    public boolean isMature;  //标志是否可成熟，成熟后可以直接卖掉
    public boolean shouldRemove; //标志是否应该被移除，例如死亡后就该移除

    public Animal(){
        setName("animal");
        babyState=new BabyState(this);
        growingState=new GrowingState(this);
        matureState=new MatureState(this);
        deadState=new DeadState(this);
        this.state=babyState;

        stockPrice=0;
        salePrice=0;

        shouldRemove=false;
        isMature=false;
    }

    public int getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(int stockPrice) {
        this.stockPrice = stockPrice;
    }

    public int getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(int salePrice) {
        this.salePrice = salePrice;
    }

    public boolean isMature() {
        return isMature;
    }

    public void setMature(boolean mature) { isMature = mature; }

    public AnimalState getState() {
        return state;
    }

    public void setState(AnimalState state) {
        this.state = state;
    }

    public void grow(){
        this.state.grow();
    }

    public void eat(){this.state.eat();}

    public boolean process(){return this.state.process();}

    public String getType(){return "Animal";}
}
