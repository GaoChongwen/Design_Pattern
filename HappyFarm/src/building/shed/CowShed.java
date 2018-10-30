package building.shed;

import base.animal.Animal;
import building.ImpVisitor.BuildingVisitor;
/**
 * @project: HappyFarm
 * @description: 动物窝的具体实现类——牛棚
 * @designPattern: Decorator
 * @author: Chen Yulei
 * @date: 2018-10-27
 **/
public class CowShed extends AnimalHouse {

    // 名称：牛棚
    private String name;

    private static CowShed instance;

    // 私有构造器
    private CowShed() {
        super();
        this.capacity = 40;
        this.animals = new Animal[40];
        this.name = "CowShed";
    }

    public static CowShed getInstance() {
        if (instance == null) {
            // 双重检查锁定
            // 保证了同一时间只能只能有一个对象访问此同步块
            synchronized (CowShed.class) {
                if(instance==null){
                    instance=new CowShed();
                }
            }
        }
        return instance;
    }
    // 获取牛棚名称
    public String getName() {
        return name;
    }

    // 设置牛棚名称
    public void setName(String name) {
        this.name = name;
    }

    public CowShed(String name) {
        this.name = name;
    }

    // 搭建牛棚
    @Override
    public void bulidShed() {
        System.out.println("Building cow shed...");
    }

    // 牛棚搭建完毕
    @Override
    public void done() {
        System.out.println("Done.\n");
    }

    // 作为Visitor模式中的接受者, 接收访问者
    @Override
    public void accept(BuildingVisitor buildingVisitor) {
//        super.accept(buildingVisitor);
        buildingVisitor.visit(this);
    }
}
