package building.shed;

import animal.Cow;
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
        this.setAnimalName("cow");
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

    // 向牛棚中添加牛牛，容量满了返回false
    public boolean add() {
        for (int i = 0; i < capacity; ++i) {
            if (animals[i] == null) {
                animals[i] = new Cow();  //找到空栏位
                return true;
            }
        }
        return false;  //没有空栏位
    }

    // 判断牛棚是否为空
    public boolean isEmpty() {
        for (int i = 0; i < capacity; ++i) {
            if (animals[i] != null) {
                return false;
            }
        }
        return true;
    }

    // 获取牛牛数量
    public int getCowCount() {
        int count = 0;
        for (int i = 0; i < capacity; ++i) {
            if (animals[i] != null) {
                count += 1;
            }
        }
        return count;
    }

    // 从牛棚中移除牛牛，牛棚为空，移除失败
    public boolean remove() {
        if (isEmpty()) {
            return false;
        }
        else {
            animals[getCowCount() - 1] = null;
            return true;
        }
    }

}
