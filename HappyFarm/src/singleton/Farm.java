package singleton;

import animal.Cow;
import base.FarmObj;
import base.Item;
import base.Produce;
import base.animal.Animal;
import base.plant.Plant;
import building.farmland.*;
import building.house.House;
import building.shed.AnimalHouse;
import building.shed.ChickShed;
import building.shed.CowShed;
import com.sun.xml.internal.ws.api.server.Adapter;
import factory.*;
import plant.Apple;
import plant.Cabbage;
import plant.Rice;
import plant.Wheat;
import produce.AnimalFood;
import produce.CookedFood;
import produce.Milk;
import propComp.PropDir.Prop;
import propComp.PropDir.Root;
import propComp.props.landAdaptor.*;
import propComp.tools.Tool;
import utils.Context;
import utils.Enum.FarmLandType;
import utils.Enum.PlantType;

import java.util.ArrayList;
import java.util.Scanner;

public class Farm extends FarmObj {
    private volatile static Farm singleton = new Farm();
    public static Farm getInstance() { return singleton; }

    private ArrayList<AnimalHouse> sheds;
    private ArrayList<FarmLand> lands;
    private House house;
    private Prop propBag;
    private ArrayList<Tool> toolBag;


    private Farm(){ }

    public void initialFarmObj(){
        System.out.println("Initialing Farm...");
        // 初始化植物
        new Apple();
        new Wheat();
        new Cabbage();
        new Rice();

        // 初始化土地并创建农田
        this.lands=new ArrayList<>(Context.capacityLand);
        this.lands.add(new CornField());
        this.lands.add(new RiceField());
        this.lands.add(new VegtbField());
        this.lands.add(new AppleField());

        // 初始化适配器
        new AppleAdaptor();
        new CornAdaptor();
        new RiceAdaptor();
        new VegtbAdaptor();
        new AllAdaptor();

        // 初始化加工副产品
        new AnimalFood();
        new CookedFood();
        new Milk();

        // 初始化农舍


        // 初始化工具包
        toolBag=new ArrayList<>(Context.capacityToolBag);

        // 初始化兑换券
        CouponFactor.getInstance().CouponInitial();

        // 初始化道具包
        propBag =new Prop();
        try{
            propBag.createTree();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 建造房屋
        this.house=House.getInstance();

        // 初始化地砖
        for (int i = 0; i < Context.tiles_color.length; i++) {
            String color = Context.tiles_color[i];
            for (int j = 0; j < Context.tiles_pattern.length; j++) {
                String key = color + Context.tiles_pattern[j];
                TileFactory.getTile(key);
            }
        }


        System.out.println("Initial Done.");

    }

    // 将工具放入工具包
    public boolean putIntoToolBag(Tool tool){
        if(tool.getType().equals("tool")){
            toolBag.add(tool);
            return true;
        }
        return false;
    }

    public void putProduceIntoPropBag(Produce product){
        propBag.addProduct(product);
    }

    public void putAdaptorIntoPropBag(LandAdaptor adapter){
        propBag.addAdaptor(adapter);
    }

    public void showToolInBag(){
        for(int i=0;i<toolBag.size();i++){
            System.out.println(i+". "+toolBag.get(i));
        }
    }

    public void showPropBag(){
        Prop.display(Root.getInstance().propDir);
    }

    public void showFarmLand(){
        System.out.println("编号\t土地类型\t栽种植物\t植物状态");
        for(int i=0;i<lands.size();i++){
            Plant plant = lands.get(i).getPlant();
            System.out.printf("%d\t%s\t%s\t%s\n",i+1,lands.get(i).getName(),plant==null?"无":plant.getName(),plant==null?"无":plant.getState());
        }
    }

    public FarmLand getFarmLand(int index){
        while(index<1||index>Context.capacityLand){
            System.out.println("该序号无效噢~ 重新输入呢~");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                index = scanner.nextInt();
                break;
            }
        }
        return lands.get(index);
    }

}
