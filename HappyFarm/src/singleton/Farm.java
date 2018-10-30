package singleton;

import animal.Cow;
import base.FarmObj;
import base.animal.Animal;
import building.farmland.*;
import building.house.House;
import building.shed.AnimalHouse;
import building.shed.ChickShed;
import building.shed.CowShed;
import factory.CouponFactor;
import factory.TileFactory;
import plant.Apple;
import plant.Cabbage;
import plant.Rice;
import plant.Wheat;
import propComp.props.landAdaptor.*;
import utils.Context;
import utils.Enum.PlantType;

import java.util.ArrayList;

public class Farm extends FarmObj {
    private volatile static Farm singleton = new Farm();
    public static Farm getInstance() { return singleton; }

    private ArrayList<AnimalHouse> sheds;
    private ArrayList<FarmLand> lands;
    private House house;

    private Farm(){ }

    private void initialFarmObj(){

        // 初始化植物
        new Apple();
        new Wheat();
        new Cabbage();
        new Rice();


        // 初始化土地并创建农田
        lands=new ArrayList<FarmLand>(4);
        lands.add(new CornField());
        lands.add(new RiceField());
        lands.add(new VegtbField());
        lands.add(new AppleField());

        // 初始化适配器
        new AppleAdaptor();
        new CornAdaptor();
        new RiceAdaptor();
        new VegtbAdaptor();
        new AllAdaptor();

        // 初始化兑换券
        CouponFactor.getInstance().CouponInitial();


        // 初始化工具包


        System.out.println("Initial Plants and Animals done.\nInitial Props done.\nInitial PropBag done.");


        // 创建牛棚、鸡舍
        sheds = new ArrayList<AnimalHouse>(2);
        sheds.add(CowShed.getInstance());
        sheds.add(ChickShed.getInstance());
        for(AnimalHouse shed:sheds){
            shed.bulidShed();
            shed.done();
        }

        // 创建屋舍
        house=House.getInstance();

        // 初始化地砖
        for (int i = 0; i < Context.tiles_color.length; i++) {
            String color = Context.tiles_color[i];
            for (int j = 0; j < Context.tiles_pattern.length; j++) {
                String key = color + Context.tiles_pattern[j];
                TileFactory.getTile(key);
            }
        }

        System.out.println("Building House done.\nInitial Tiles done.");

        System.out.println("Initial done.\n Welcome to Happy Farm.");
    }

    public AnimalHouse getAnimalHouse(int index){
        if(index<0||index>sheds.size()){return null;}
        return sheds.get(index);
    }

    // 查看棚的信息
    public void inspectSheds(){
        for (AnimalHouse shed: sheds){
            shed.getName();
        }
    }





}
