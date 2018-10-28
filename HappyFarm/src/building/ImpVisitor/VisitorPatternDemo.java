package building.ImpVisitor;

import building.house.House;
import building.shed.ChickShed;
import building.shed.CowShed;
import building.shed.Shed;

/**
 * @project: HappyFarm
 * @description: 测试使用场景：为建筑类增添节日气氛
 * @designPattern: Visitor
 * @author: Chen Yulei
 * @date: 2018-10-28
 **/
public class VisitorPatternDemo {

    public static void main(String[] args) {

        // 给房子增添春节的气息
        BuildingAcceptor house= House.getInstance();
        house.accept(new SpringVisitor());

        // 给房子增添圣诞节的气息
        house.accept(new ChristmasVisitor());

        // 给牛棚1号制造春节的氛围
        Shed cowShed1 = new CowShed("牛棚1号");
        cowShed1.accept(new SpringVisitor());

        // 给牛棚2号制造圣诞节的氛围
        Shed cowShed2 = new CowShed("牛棚2号");
        cowShed2.accept(new ChristmasVisitor());

        // 给鸡窝1号制造春节的氛围
        Shed chickShed1 = new ChickShed("鸡窝1号");
        chickShed1.accept(new SpringVisitor());

        // 给鸡窝制2号造圣诞节的氛围
        Shed chickShed2 = new ChickShed("鸡窝2号");
        chickShed2.accept(new ChristmasVisitor());


    }
}
