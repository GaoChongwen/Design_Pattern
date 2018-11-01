package store.Specification;

import base.plant.Plant;
import test.specification.Specification;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SpecificationShow {
    private static SpecificationShow instance;

    // 私有构造器
    private SpecificationShow() { }

    public static SpecificationShow getInstance() {
        if (instance == null) {
            // 双重检查锁定
            // 保证了同一时间只能只能有一个对象访问此同步块
            synchronized (SpecificationShow.class) {
                if(instance==null){
                    instance=new SpecificationShow();
                }
            }
        }
        return instance;
    }
    public void useSpecification(ArrayList<Plant> plants , Integer price){
        if(plants.isEmpty()){
            System.out.println("Plant number is zero.");
            return ;
        }
        Map<String,Integer> plantNum = new HashMap<String, Integer>();
        Map<String,Integer> plantPrice = new HashMap<String, Integer>();
        //打印出价格高于20的植物
        System.out.println("===The price of plant is higher than "+price+"===");
        //定义一个规格
        ISpecification spec = new PlantByPriceThan(price);
        for(Plant u:plants){
            if(spec.isSatisfiedBy(u))
                if(plantNum.containsKey(u.getName())){
                    plantNum.put(u.getName(),plantNum.get(u.getName())+1);
                }
                else {
                    plantNum.put(u.getName(), 1);
                    plantPrice.put(u.getName(), u.getSalePrice());
                }
        }

        for (Map.Entry<String, Integer> entry : plantNum.entrySet()) {

            System.out.println(plantNum.get(entry.getKey())+"  "+entry.getKey() + ", Price = " + plantPrice.get(entry.getKey()));

        }
    }
}
