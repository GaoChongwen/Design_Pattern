package factory;

import building.tile.Tile;
import building.tile.TilePool;

import java.util.HashMap;

// 场景：根据图纸来铺地砖
public class TileFactory extends BuildingFactory{

    // 池容器
    private static HashMap<String, Tile> pool = new HashMap<String, Tile>();

//    public static Tile getTile() {
//        return new Tile();
//    }

    public static Tile getTile(String key) {

        Tile result = null;

        if (!pool.containsKey(key)) {

            // 新的地砖样式先照着图纸做出一块，放入地砖库中，以后便可做出相同的地砖，直接从地砖库中取用
            System.out.println(key + " 这是新的地砖样式，先照着图做出一块然后放到地砖库中去");
            result = new TilePool(key);
            pool.put(key, result);

        } else {
            result = pool.get(key);
            System.out.println(key + " 这是地砖库中有的地砖，直接取来用");

        }
        return result;
    }
}