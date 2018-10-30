package test.visitor;

import animal.Cow;
import building.ImpVisitor.BuildingAcceptor;
import building.ImpVisitor.ChristmasVisitor;
import building.ImpVisitor.SpringVisitor;
import building.house.House;
import building.shed.AnimalHouse;
import building.shed.ChickShed;
import building.shed.CowShed;
import com.sun.javafx.css.parser.Css2Bin;

/**
 * @project: HappyFarm
 * @description: 测试使用场景：为建筑类增添节日气氛
 * @designPattern: Visitor
 * @author: Chen Yulei
 * @date: 2018-10-28
 **/
public class VisitorPatternDemo {

    public static void main(String[] args) {

        System.out.println("============= Test Visitor Pattern =============");
        System.out.println("=== Add a festive atmosphere to the building ===");

        // 给房子增添春节的气息
        BuildingAcceptor house= House.getInstance();
        house.accept(new SpringVisitor());

        // 给房子增添圣诞节的气息
        house.accept(new ChristmasVisitor());

        // 给牛棚1号制造春节的氛围
        AnimalHouse cowShed1 = CowShed.getInstance();
        cowShed1.accept(new SpringVisitor());

        // 给牛棚2号制造圣诞节的氛围
        AnimalHouse cowShed2 = CowShed.getInstance();
        cowShed2.accept(new ChristmasVisitor());

        // 给鸡窝1号制造春节的氛围
        AnimalHouse chickShed1 = ChickShed.getInstance();
        chickShed1.accept(new SpringVisitor());

        // 给鸡窝制2号造圣诞节的氛围
        AnimalHouse chickShed2 = ChickShed.getInstance();
        chickShed2.accept(new ChristmasVisitor());


    }
}
