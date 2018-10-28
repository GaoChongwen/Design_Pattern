package building.tile;

/**
 * @project: HappyFarm
 * @description: 地砖类
 * @designPattern: Flyweight
 * @author: Chen Yulei
 * @date: 2018-10-27
 **/
public class Tile {

    // 地砖的颜色
    private String color;

    // 地砖的图案
    private String pattern;

    // 铺地砖的位置
    private int location;


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

}
