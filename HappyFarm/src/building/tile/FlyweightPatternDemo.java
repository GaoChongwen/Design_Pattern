package building.tile;

import factory.TileFactory;
import org.omg.CORBA.TIMEOUT;
/**
 * @project: HappyFarm
 * @description: 测试使用场景：按照规定的图案铺地砖
 * @designPattern: Flyweight
 * @author: Chen Yulei
 * @date: 2018-10-27
 **/
public class FlyweightPatternDemo {

    public static void main(String[] agrs) {

        String[] colors = {"red", "orange", "yellow", "green", "blue", "purple", "白色"};
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
