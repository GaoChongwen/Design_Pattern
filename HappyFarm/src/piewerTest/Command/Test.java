package piewerTest.Command;

import building.house.House;
import building.house.command.*;

public class Test {
    public static void main(String[] args) {
        System.out.println("Command Pattern test");
        //初始化命令
        AddChair addChair=new AddChair(House.getInstance());
        AddDesk addDesk=new AddDesk(House.getInstance());
        RemoveDesk removeDesk=new RemoveDesk(House.getInstance());
        RemoveChair removeChair=new RemoveChair(House.getInstance());
        Invoker invoker = new Invoker();


        House.getInstance().showFurnitures();
        //执行addChair
        System.out.println("Test addChair Command! ");
        invoker.setCommand(addChair);
        invoker.runCommand();
        House.getInstance().showFurnitures();

        //执行addDesk
        System.out.println("Test addDesk Command! ");
        invoker.setCommand(addDesk);
        invoker.runCommand();
        House.getInstance().showFurnitures();
        //执行removeChair
        System.out.println("Test removeChair Command! ");
        invoker.setCommand(removeChair);
        invoker.runCommand();
        House.getInstance().showFurnitures();
        //执行removeDesk
        System.out.println("Test removeDesk Command! ");
        invoker.setCommand(removeDesk);
        invoker.runCommand();
        House.getInstance().showFurnitures();
    }
}
