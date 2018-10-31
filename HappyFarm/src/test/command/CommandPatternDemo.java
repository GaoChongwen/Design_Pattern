package test.command;

import building.house.House;
import building.house.command.*;
import building.house.furniture.Furniture;
import building.house.memento.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @project: command
 * @description: 测试demo
 * @designPatter: Command
 * @author: Chen Zhi
 * @create: 2018-10-28
 **/
public class CommandPatternDemo {
    public static void main(String[] args) {
        //初始化命令
        AddChair addChair=new AddChair(House.getInstance());
        AddDesk addDesk=new AddDesk(House.getInstance());
        RemoveDesk removeDesk=new RemoveDesk(House.getInstance());
        RemoveChair removeChair=new RemoveChair(House.getInstance());
        Invoker invoker = new Invoker();


        House.getInstance().showFurnitures();
        //执行addChair
        System.out.println("Command Pattern:invoker:setCommand(addChair)&runCommand():addChair to furnitures");
        invoker.setCommand(addChair);
        invoker.runCommand();
        House.getInstance().showFurnitures();
        //执行addDesk
        System.out.println("Command Pattern:invoker:setCommand(addDesk)&runCommand():addDesk to furnitures");
        invoker.setCommand(addDesk);
        invoker.runCommand();
        House.getInstance().showFurnitures();
        //执行removeChair
        System.out.println("Command Pattern:invoker:setCommand(removeChair)&runCommand():removeChair from furnitures");
        invoker.setCommand(removeChair);
        invoker.runCommand();
        House.getInstance().showFurnitures();
        //执行removeDesk
        System.out.println("Command Pattern:invoker:setCommand(removeDesk)&runCommand():removeDesk from furnitures");
        invoker.setCommand(removeDesk);
        invoker.runCommand();
        House.getInstance().showFurnitures();
    }
}
