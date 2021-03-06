package building.house;

import base.FarmObj;
import building.ImpVisitor.BuildingAcceptor;
import building.ImpVisitor.BuildingVisitor;
import building.house.airconditioner.AirConditioner;
import building.house.airconditioner.ProxyConditioner;
import building.house.furniture.Furniture;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @project: HappyFarm
 * @description: 房屋的组合实体
 * @designPattern: CompositeEntity, Visitor, Singleton, DoubleCheckLocking,Proxy
 * @author: Chen Yulei
 * @date: 2018-10-27
 **/
public class House extends FarmObj implements BuildingAcceptor {

    // 依赖的粗粒度读对象
    private CoarseGrainedHouse cgh = new CoarseGrainedHouse();

    private static House instance;

    private String houseName="your house";
    private AirConditioner airConditioner = new ProxyConditioner();

    // 房屋中有的家具
    ArrayList<Furniture> furnitures = new ArrayList<>();

    // 私有构造器
    private House() { }

    public static House getInstance() {
        if (instance == null) {
            // 双重检查锁定
            // 保证了同一时间只能只能有一个对象访问此同步块
            synchronized (House.class) {
                if(instance==null){
                    instance=new House();
                }
            }
        }
        return instance;
    }

    // 设置房屋信息
    public void setInfo(String wallInfo, String doorInfo, String tileInfo, String windowInfo){
        cgh.setCpnInfo(wallInfo, doorInfo, tileInfo, windowInfo);
    }

    public String[] getInfo(){
        return cgh.getCpnInfo();
    }

    // 打印房屋信息
    public void showHouse(){
        System.out.print("The house has：");
        for (int i = 0; i < cgh.getCpnInfo().length; i++) {
            System.out.print(cgh.getCpnInfo()[i] + " ");
        }
        System.out.print("\n");
    }

    // 作为Visitor模式中的接受者, 接收访问者
    @Override
    public void accept(BuildingVisitor buildingVisitor) {
        buildingVisitor.visit(this);
    }

    public void addFurniture(Furniture furniture){
        furnitures.add(furniture);
    }
    public void removeFuniture(Furniture furniture){
        for(int i=furnitures.size()-1;i>=0;i--){

            if(furnitures.get(i).getName()==furniture.getName()){
                furnitures.remove(i);
            }
        }
    }
    public void showFurnitures(){
        System.out.println("the furnitures are:");
        for(Furniture f:furnitures){
            System.out.println(f.getName());
        }
        if(furnitures.size()==0)
            System.out.println("nothing");
        System.out.println("**********");
    }
    public boolean contains(Furniture furniture){
        return furnitures.contains(furniture);
    }
    public String getHouseName(){
        return  houseName;
    }
    public void setHouseName(){
        System.out.println("input your house name");
        Scanner in =new Scanner(System.in);
        String houseName=in.nextLine();
        this.houseName=houseName;
    }

    public void setHouseName(String houseName){
        this.houseName=houseName;
    }
    public void showHouseName(){
        System.out.println("your housename is "+houseName);
    }
}
