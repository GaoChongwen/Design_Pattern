package singleton;

import base.FarmObj;
import building.farmland.AppleField;
import building.farmland.CornField;
import building.farmland.RiceField;
import building.farmland.VegtbField;
import factory.CouponFactor;
import factory.TileFactory;
import plant.Apple;
import plant.Cabbage;
import plant.Rice;
import plant.Wheat;
import utils.Enum.PlantType;

public class Farm extends FarmObj {
    private volatile static Farm singleton = new Farm();
    public static Farm getInstance() { return singleton; }

    private Farm(){

    }


    private void initialFarmObj(){
        // 初始化植物
        new Apple();
        new Wheat();
        new Cabbage();
        new Rice();
        // 初始化土地
        new CornField();
        new RiceField();
        new VegtbField();
        new AppleField();

        // 初始化兑换券
        CouponFactor.getInstance().CouponInitial();

        // 初始化地砖
        String[] colors = {"红色", "橙色", "黄色", "绿色", "蓝色", "紫色", "白色"};
        String[] pattern = {"条纹", "格子", "碎花"};
        for (int i = 0; i < colors.length; i++) {
            String color = colors[i];
            for (int j = 0; j < pattern.length; j++) {
                String key = color + pattern[j];
                TileFactory.getTile(key);
            }
        }
    }



}
