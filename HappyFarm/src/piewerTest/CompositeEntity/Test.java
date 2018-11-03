package piewerTest.CompositeEntity;

import building.house.House;

public class Test {
    public static void main(String[] args) {
        System.out.println("===组合实体模式==");
        House house = House.getInstance();
        house.showHouse();
        house.setInfo("BlackWall", "BlackDoor", "BlackTile","PushableWindow");
        house.showHouse();
        house.setInfo("GrayWall", "IronDoor", "GreenTile","SlidableWindow");
        house.showHouse();
    }
}
