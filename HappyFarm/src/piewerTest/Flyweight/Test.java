package piewerTest.Flyweight;

import building.tile.Tile;
import factory.TileFactory;

public class Test {
    public static void main(String[] agrs) {

        System.out.println("======= Test Flyweight Pattern =======");
        System.out.println("Goal: Floor tiles in order to the tile pattern.\n");

        //向地砖库中首先添加一些地砖
        System.out.println("==== 1. We build some new tiles ====");
        String[] colors = {"Red", "Orange", "Yellow", "Green", "Blue", "Purple", "White"};
        String[] pattern = {"Stripe", "Lattice", "Floral"};
        for (int i = 0; i < colors.length; i++) {
            String color = colors[i];
            for (int j = 0; j < pattern.length; j++) {
                String key = color + pattern[j];
                TileFactory.getTile(key);
            }
        }
        System.out.println();

        //验证此这些地砖存在于地砖库
        System.out.println("==== 2. Check some existing tiles ====");
        Tile tile1 = TileFactory.getTile("RedFloral");
        Tile tile2 = TileFactory.getTile("YellowFloral");
        Tile tile3 = TileFactory.getTile("BlueLattice");
        Tile tile4 = TileFactory.getTile("PurpleStripe");
        System.out.println();

        //验证这些地砖不存在于地砖库
        System.out.println("==== 3. Check some non-existing tiles ====");
        Tile tile5 = TileFactory.getTile("BlackFloral");
        Tile tile6 = TileFactory.getTile("PinkFloral");
        Tile tile7 = TileFactory.getTile("BlackLattice");
        Tile tile8 = TileFactory.getTile("PinkStripe");

    }
}
