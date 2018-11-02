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
import person.Employee;
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
import propComp.tools.ReapingMachine;
import propComp.tools.RiceReapingMachine;
import propComp.tools.Sickle;
import propComp.tools.Tool;
import utils.Context;
import utils.Enum.EmployeeSkill;
import utils.Enum.FarmLandType;
import utils.Enum.PlantType;

import java.util.*;

public class Farm extends FarmObj {
    private volatile static Farm singleton = new Farm();
    public static Farm getInstance() { return singleton; }

    private CowShed cowShed = CowShed.getInstance();
    private ChickShed chickShed =ChickShed.getInstance();
    private ArrayList<FarmLand> lands;
    private House house;
    private Prop propBag;
    private HashMap<String,Tool> toolBag;
    private HashMap<String,Integer> toolNum;
    private ArrayList<Employee> employees;


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
        cowShed.bulidShed();
        chickShed.bulidShed();


        // 初始化工具包
         toolBag= new HashMap<>();
         toolBag.put("sickle",new Sickle());
         toolBag.put("reapingMachine",new ReapingMachine());

         toolNum =new HashMap<>();
         toolNum.put("sickle",0);
         toolNum.put("reapingMachine",0);

        // 初始化兑换券
        CouponFactor.getInstance().CouponInitial();
        CouponFactor.getInstance().add(PlantType.apple.toString());
        CouponFactor.getInstance().add(PlantType.wheat.toString());
        CouponFactor.getInstance().add(PlantType.rice.toString());
        CouponFactor.getInstance().add(PlantType.cabbage.toString());
        CouponFactor.getInstance().add("super");

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
        // 雇员
        employees = new ArrayList<Employee>(10);
        employees.add(new Employee("A", EmployeeSkill.cultivation,10));
        employees.add(new Employee("B", EmployeeSkill.breeding,20));

        System.out.println("Initial Done.");

    }

    /**
     * 对工具包的操作：
     * - 放入工具包
     * - 展示工具
     * - 通过工具名获取工具包中的工具
     */

    // 将工具放入工具包
    public boolean putIntoToolBag(Tool tool){
        if(tool.getType()=="tool"){
            toolNum.put(tool.getName(),toolNum.get(tool.getName())+1);
            return true;
        }
        return false;
    }

    public boolean showToolInBag(){
        boolean isEmpty=true;
        for (Map.Entry<String,Integer> entry : toolNum.entrySet()) {
            if(entry.getValue()!=0){isEmpty=false;}
        }
        if(isEmpty){
            System.out.println("工具包里暂时没有工具噢~");
            return false;
        }
        for (Map.Entry<String,Tool> entry : toolBag.entrySet()) {
            System.out.printf("%s\t有%d个\n",entry.getKey(),toolNum.get(entry.getKey()));
        }
        return true;
    }

    public Tool getToolByName(String tool){
        Tool t = toolBag.get(tool);
        if(t==null) {
            System.out.println("暂时没有这个工具噢～ 可爱的小姑娘可以去商店看看，现在文渊老板打一折呢！");
            return null;
        }
        return t;
    }


    /**
     * 对道具包的操作：
     * - 将加工副产品加入道具包
     * - 将适配器加入道具包
     * - 展示道具包中所有道具
     * - 展示道具包中所有适配器
     * - 展示道具包中所有加工副产品
     */

    public void putProduceIntoPropBag(Produce product){
        propBag.addProduct(product);
    }

    public void putAdaptorIntoPropBag(LandAdaptor adapter){
        propBag.addAdaptor(adapter);
    }

    public void showAllInPropBag(){ Prop.display(Root.getInstance().propDir); }

    public void showAdaptorInPropBag(){ Prop.displayAdaptor(); }

    public void showProduceInPropBag(){ Prop.displayProduct(); }

    /**
     * 对种植园的操作：
     * - 展示种植园的所有土地、栽种植物以及植物状态
     * - 对种植园某块土地进行操作
     */

    public void showFarmLand(){
        System.out.println("编号\t土地类型\t栽种植物\t植物状态");
        for(int i=0;i<lands.size();i++){
            Plant plant = lands.get(i).getPlant();
            System.out.printf("%d\t%s\t%s\t%s\n",i+1,lands.get(i).getName(),plant==null?"无":plant.getName(),plant==null?"无":plant.getState());
        }
    }

    public FarmLand getFarmLand(int index){
        while(index<1||index>Context.capacityLand){
            System.out.println("该序号无效噢~ 重新输入呢~\n请重新输入：");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                index = scanner.nextInt();
                break;
            }
        }
        return lands.get(index);
    }


    public ArrayList<Employee> getEmployees(){return employees;}
    /**
     * 对农舍的操作：
     * - 展示农舍的牛棚和鸡窝、及其状态
     * - 对牛棚或鸡窝进行操作
     */

//    public void showSheds(){
//        // 牛棚
//        System.out.printf("牛棚~\t可以养殖%d头牛，目前牛棚里有%d头牛～\n",cowShed.getCapacity(),cowShed.getCowCount());
//
//        // 鸡舍
//        System.out.printf("鸡舍~\t可以养殖%d只鸡，目前鸡舍里有%d只鸡～\n",cowShed.getCapacity(),cowShed.getCowCount());
//    }


}
