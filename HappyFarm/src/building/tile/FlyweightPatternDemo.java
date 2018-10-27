package building.tile;

import factory.TileFactory;
import org.omg.CORBA.TIMEOUT;

public class FlyweightPatternDemo {

    public static void main(String[] agrs) {

        String[] colors = {"红色", "橙色", "黄色", "绿色", "蓝色", "紫色", "白色"};
        String[] pattern = {"条纹", "格子", "碎花"};
        for (int i = 0; i < colors.length; i++) {
            String color = colors[i];
            for (int j = 0; j < pattern.length; j++) {
                String key = color + pattern[j];
                TileFactory.getTile(key);
            }
        }
        Tile tile = TileFactory.getTile("红色碎花");
    }
}
