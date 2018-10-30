package singleton;

import animal.Cow;
import base.FarmObj;
import base.animal.Animal;
import base.plant.Plant;
import building.farmland.*;
import building.house.House;
import building.shed.AnimalHouse;
import building.shed.ChickShed;
import building.shed.CowShed;
import factory.*;
import plant.Apple;
import plant.Cabbage;
import plant.Rice;
import plant.Wheat;
import propComp.props.landAdaptor.*;
import utils.Context;
import utils.Enum.FarmLandType;
import utils.Enum.PlantType;

import java.util.ArrayList;

public class Farm extends FarmObj {
    private volatile static Farm singleton = new Farm();
    public static Farm getInstance() { return singleton; }

    private ArrayList<AnimalHouse> sheds;
    private ArrayList<FarmLand> lands;
    private House house;

    private Farm(){ }

    public static void initialFarmObj(){
        System.out.println("Initialing Farm...");
        // 初始化植物
        new Apple();
        new Wheat();
        new Cabbage();
        new Rice();

        // 初始化土地
        new CornField();
        new RiceField();
        new VegtbField();
        new AppleField();

        // 初始化适配器
        new AppleAdaptor();
        new CornAdaptor();
        new RiceAdaptor();
        new VegtbAdaptor();
        new AllAdaptor();

        // 初始化兑换券
        CouponFactor.getInstance().CouponInitial();

        System.out.println("Initial Done.");
        }

    }
