package base.plant;


import base.FarmObj;
import utils.Enum.FarmLandType;
import utils.Enum.PlantType;

/**
 * @Project: HappyFarm
 * @description: 植物抽象类——植物
 * @Design-Pattern: State, Prototype
 * @author lipeng liang
 * @version 2018/10/28
 */


public abstract class Plant extends FarmObj implements Cloneable {
    protected PlantState state;
    protected int stockPrice;
    protected int salePrice;
    protected PlantType type;
    protected FarmLandType reqLandType;

    protected Plant() {
        state = SeedState.getInstance();
    }

    // 获取植物种类
    @Override
    public String getName() {
        return this.type.toString();
    }


    // 获取类型
    @Override
    public String getType() {
        return "Plant";
    }

    // 获取购买价格
    public int getStockPrice() {
        return this.stockPrice;
    }

    // 获取售卖价格
    public int getSalePrice() {
        return this.salePrice;
    }

    // 获取需要的土地类型
    public FarmLandType getReqLandType() {
        return this.reqLandType;
    }

    /**
     * @Design-Pattern: State
     */

    // 设置状态
    protected void setState(PlantState state) { this.state = state; }

    // 种植
    public boolean plant(FarmLandType landType) {
        if (landType == FarmLandType.allField || landType == reqLandType) {
            return state.plant(this);
        }
        return false;
    }

    // 收获
    public boolean harvest() { return state.harvest(this); }

    // 生长
    public void grow(){
        state.grow(this);
    }

    // 加工
    public boolean process(){ return state.process(this);}

    protected void harvest(int _) { System.out.println(type+" harvest success!");}

    protected void process(int _) { System.out.println(type+" process success!");}


    /**
     * @Design-Pattern: Prototype
     */
    public Plant clone() {
        Plant clone = null;
        try {
            clone = (Plant) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

}