package singleton;

import base.plant.Plant;
import utils.Enum.PlantType;

import java.util.ArrayList;

/**
 * @project: HappyFarm
 * @description: 仓库类，存放植物
 * @designPattern: Singleton
 * @author: Chen Yulei
 * @date: 2018-10-29
 **/
public class Repository {

    ArrayList<Plant> plants = new ArrayList<>();

    private static Repository instance;

    // 私有构造器
    private Repository() { }

    public static Repository getInstance() {
        if (instance == null) {
            // 双重检查锁定
            // 保证了同一时间只能只能有一个对象访问此同步块
            synchronized (Repository.class) {
                if(instance==null){
                    instance=new Repository();
                }
            }
        }
        return instance;
    }

    // 向仓库中添加植物（任意个）
    void add(Plant ... somePlants) {

        // 判断每个植物是否添加成功
        boolean flag = true;

        for (int i = 0; i < somePlants.length; i++) {
            flag = plants.add(somePlants[i]);
            if (!flag) {
                System.out.println("第" + i + "个植物添加失败!");
            }
        }
    }

    // 从仓库中删除植物，传入被删除的植物
    boolean remove(Plant plant) {
        return plants.remove(plant);
    }

    // 从仓库中删除植物，传入索引
    Plant remove(int index) {
        return plants.remove(index);
    }

    // 仓库中是否包含某种植物
    boolean contains(Plant plant) {
        return plants.contains(plant);
    }

    // 从仓库中获取植物，传入植物类型，返回所有此类型的植物
    ArrayList<Plant> get(PlantType plantType) {
        ArrayList<Plant> somePlants = new ArrayList<>();
        for (int i = 0; i < plants.size(); i++) {
            Plant curPlant = plants.get(i);
            if (curPlant.getType() == plantType) {
                somePlants.add(curPlant);
            }
        }
        return somePlants;
    }

    // 从仓库中获取植物，传入索引
    Plant get(int index) {
        return plants.get(index);
    }

    @Override
    public String toString() {
        return "Repository{" +
                "plants=" + plants +
                '}';
    }
}
