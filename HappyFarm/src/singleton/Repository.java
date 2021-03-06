package singleton;

import base.plant.Plant;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import utils.Enum.PlantType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * @project: HappyFarm
 * @description: 仓库类，存放植物
 * @designPattern: Singleton
 * @author: Chen Yulei
 * @date: 2018-10-29
 **/
public class Repository {

    public ArrayList<Plant> getPlants() {
        return plants;
    }

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
    public void add(Plant ... somePlants) {

        // 判断每个植物是否添加成功
        boolean flag = true;

        for (int i = 0; i < somePlants.length; i++) {
            flag = plants.add(somePlants[i]);
            if (!flag) {
                System.out.println(i + ": add failed!");
            }
        }
    }

    // 从仓库中删除植物，传入被删除的植物
    public boolean remove(Plant plant) {
        return plants.remove(plant);
    }

    // 从仓库中删除植物，传入索引
    public Plant remove(int index) {
        return plants.remove(index);
    }

    // 仓库中是否包含某种植物
    public boolean contains(Plant plant) {
        return plants.contains(plant);
    }

    // 从仓库中获取植物，传入植物类型，返回所有此类型的植物
    public ArrayList<Plant> get(String plantType) {
        ArrayList<Plant> somePlants = new ArrayList<>();
        for (int i = 0; i < plants.size(); i++) {
            Plant curPlant = plants.get(i);
            if (curPlant.getName().equals(plantType)) {
                somePlants.add(curPlant);
            }
        }
        return somePlants;
    }

    // 获取某种植物的数量
    public int getPlantNum(String plantType) {
        return get(plantType).size();
    }

    // 从仓库中获取植物，传入索引
    public Plant get(int index) {
        return plants.get(index);
    }

    @Override
    public String toString() {
        return "Repository{" +
                "plants=" + plants +
                '}';
    }

    // 判断仓库是否为空
    public boolean isEmtpy() {
        return plants.isEmpty();
    }

    // 打印仓库的信息
    // 格式 名字 数量
    public void printRepoInfo() {
        Hashtable<String, Integer> exitPlant = new Hashtable<>();
        for (Plant plant : plants) {
//            System.out.println(plant.getName());
            if (!exitPlant.containsKey(plant.getName())) {
                exitPlant.put(plant.getName(), 1);
            }else {
                int value = exitPlant.get(plant.getName()) + 1;
                System.out.println(value);
                exitPlant.put(plant.getName(), value);
            }
        }
        System.out.println("Name\tNumber");
        for (Map.Entry entry : exitPlant.entrySet()) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }
    }
}
