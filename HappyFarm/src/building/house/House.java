package building.house;

import base.FarmObj;
import building.ImpVisitor.BuildingAcceptor;
import building.ImpVisitor.BuildingVisitor;
import building.house.furniture.Furniture;

import java.util.ArrayList;

/**
 * @project: HappyFarm
 * @description: 房屋的组合实体
 * @designPattern: CompositeEntity, Visitor, Singleton, DoubleCheckLocking
 * @author: Chen Yulei
 * @date: 2018-10-27
 **/
public class House extends FarmObj implements BuildingAcceptor {

    // 依赖的粗粒度读对象
    private CoarseGrainedHouse cgh = new CoarseGrainedHouse();

    private static House instance;

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
        System.out.print("这个房子拥有：");
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

    // 向房屋中增添家具
    public boolean addFurniture(Furniture furniture) {
        return furnitures.add(furniture);
    }

    // 想房屋中删除家具
    public boolean removeFurniture(Furniture furniture) {
        return furnitures.remove(furniture);
    }

    // 获取房屋中的所有家具
    public ArrayList<Furniture> getFurnitures() {
        return furnitures;
    }

    // 判断房屋中是否存在某种furniture
    public boolean contains(Furniture furniture) {
        return furnitures.contains(furniture);
    }
}
