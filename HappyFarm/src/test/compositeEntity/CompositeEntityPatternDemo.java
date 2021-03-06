package test.compositeEntity;

import building.house.House;

/**
 * @project: HappyFarm
 * @description: 测试使用场景：设置房屋的组件（墙，门，瓦，窗户）的样式
 * @designPattern: Composite Entity Pattern
 * @author: Chen Yulei
 * @date: 2018-10-27
 **/
public class CompositeEntityPatternDemo {
    public static void main(String[] args) {

        System.out.println("====== Test Composite Entity Pattern ======");
        System.out.println("Set the style of the house's components (walls, doors, tiles, windows)");
        System.out.println();

        House house = House.getInstance();

        house.showHouse();

        // 设置房子信息为"黄墙", "木质门", "红瓦","可推拉窗户"
        house.setInfo("YellowWall", "WoodenDoor", "RedTile","PushableWindow");
        house.showHouse();

        // 设置房子信息为"灰墙", "铁门", "绿瓦","滑动窗户"
        house.setInfo("GrayWall", "IronDoor", "GreenTile","SlidableWindow");
        house.showHouse();

        // 设置房子信息为"白墙", "铁门", "绿瓦","滑动窗户"
        house.setInfo("WhiteWall", "IronDoor", "GreenTile","SlidableWindow");
        house.showHouse();
    }

}
