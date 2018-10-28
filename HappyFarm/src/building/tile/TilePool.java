package building.tile;

/**
 * @project: HappyFarm
 * @description: 地砖库
 * @designPattern: Flyweight
 * @author: Chen Yulei
 * @date: 2018-10-27
 **/
public class TilePool extends Tile {

    // 地砖的样式（如红色碎花）作为key
    private String key;

    public TilePool(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
