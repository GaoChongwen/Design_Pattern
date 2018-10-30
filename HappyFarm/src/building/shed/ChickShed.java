package building.shed;

import base.animal.Animal;
import building.ImpVisitor.BuildingVisitor;
/**
 * @project: HappyFarm
 * @description: 动物窝的具体实现类——鸡窝
 * @designPattern: Decorator
 * @author: Chen Yulei
 * @date: 2018-10-27
 **/
public class ChickShed extends AnimalHouse {

    // 名称：鸡窝
    private String name;

    private static ChickShed instance;

    // 私有构造器
    private ChickShed() {
        super();
        this.capacity = 40;
        this.animals = new Animal[40];
        this.name = 
    }

    public static ChickShed getInstance() {
        if (instance == null) {
            // 双重检查锁定
            // 保证了同一时间只能只能有一个对象访问此同步块
            synchronized (ChickShed.class) {
                if(instance==null){
                    instance=new ChickShed();
                }
            }
        }
        return instance;
    }

    // 获取鸡窝名字
    public String getName() {
        return name;
    }

    // 设置鸡窝名字
    public void setName(String name) {
        this.name = name;
    }

    // 搭建鸡窝
    @Override
    public void bulidShed() {
        System.out.println("正在为小鸡搭建鸡窝...");
    }

    // 鸡窝搭建完成
    @Override
    public void done() {
        System.out.println("一个简陋的鸡窝搭建完成。\n");
    }

    // 作为Visitor模式中的接受者, 接收访问者
    @Override
    public void accept(BuildingVisitor buildingVisitor) {
//        super.accept(buildingVisitor);
        buildingVisitor.visit(this);
    }
}
