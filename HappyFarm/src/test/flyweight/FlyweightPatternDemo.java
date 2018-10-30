package test.flyweight;

import building.tile.Tile;
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

        System.out.println("====== Test Flyweight Pattern =====");

        String[] colors = {"Red", "Orange", "Yellow", "Green", "Blue", "Purple", "White"};
        String[] pattern = {"Stripe", "Lattice", "Floral"}; // 条纹 格子 碎花
        for (int i = 0; i < colors.length; i++) {
            String color = colors[i];
            for (int j = 0; j < pattern.length; j++) {
                String key = color + pattern[j];
                TileFactory.getTile(key);
            }
        }
        Tile tile = TileFactory.getTile("RedFloral"); // 红色碎花
    }
}
