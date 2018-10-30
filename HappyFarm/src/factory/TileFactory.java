package factory;

import building.tile.Tile;
import building.tile.TilePool;

import java.util.HashMap;

/**
 * @project: HappyFarm
 * @description: 地砖的工厂
 *               当地砖库(TilePool)中存在相同样式时直接取用
 *               不存在时新建一块地砖，并将地砖放入地砖库中以备以后使用
 * @designPattern: Flyweight
 * @author: Chen Yulei
 * @date: 2018-10-27
 **/
// 场景：根据图纸来铺地砖
public class TileFactory extends AbstractFactory {

    // 池容器
    private static HashMap<String, Tile> pool = new HashMap<String, Tile>();

    // 获取地砖（直接获取 或 创建新的）
    public static Tile getTile(String key) {

        Tile result = null;

        if (!pool.containsKey(key)) {

            // 新的地砖样式先照着图纸做出一块，放入地砖库中，以后便可做出相同的地砖，直接从地砖库中取用
            System.out.println(key + " 这是新的地砖样式，正在制作新地砖... 制作成功。");
            result = new TilePool(key);
            result.setColor(key.substring(0,2));
            result.setPattern(key.substring(2,4));
            pool.put(key, result);

        } else {
            result = pool.get(key);
            System.out.println(key + " 这是地砖库存在的样式，直接取来用");

        }
        return result;
    }
}