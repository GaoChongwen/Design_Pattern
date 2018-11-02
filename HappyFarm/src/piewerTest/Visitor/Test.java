package piewerTest.Visitor;

import building.ImpVisitor.BuildingAcceptor;
import building.ImpVisitor.ChristmasVisitor;
import building.ImpVisitor.SpringVisitor;
import building.house.House;
import building.shed.AnimalHouse;
import building.shed.ChickShed;
import building.shed.CowShed;

public class Test {
    public static void main(String[] args) {

        System.out.println("===== Test Visitor Pattern =====");
        System.out.println("Goal: Add a festive atmosphere to the building.\n");

        /*
        对房子的操作
         */
        //给房子增添春节的气息
        BuildingAcceptor house= House.getInstance();
        house.accept(new SpringVisitor());

        //给房子增添圣诞节的气息
        house.accept(new ChristmasVisitor());

        /*
        对牛棚的操作
         */
        //给牛棚制造春节的氛围
        AnimalHouse cowShed1 = CowShed.getInstance();
        cowShed1.accept(new SpringVisitor());

        //给牛棚制造圣诞节的氛围
        AnimalHouse cowShed2 = CowShed.getInstance();
        cowShed2.accept(new ChristmasVisitor());

        /*
        对鸡舍的操作
         */
        //给鸡舍制造春节的氛围
        AnimalHouse chickShed1 = ChickShed.getInstance();
        chickShed1.accept(new SpringVisitor());

        //给鸡舍造圣诞节的氛围
        AnimalHouse chickShed2 = ChickShed.getInstance();
        chickShed2.accept(new ChristmasVisitor());


    }
}
