package piewerTest.NullObject;
import building.house.House;
import building.house.NullObject.AbstractCommand;
import building.house.NullObject.CommandFactory;
import building.house.command.*;

import java.util.Scanner;


import building.house.House;
import building.house.NullObject.AbstractCommand;
import building.house.NullObject.CommandFactory;
import building.house.command.*;

import java.util.Scanner;
public class Test {
    public static  void main(String arg[]){

        AddChair addChair=new AddChair(House.getInstance());
        AddDesk addDesk=new AddDesk(House.getInstance());
        RemoveDesk removeDesk=new RemoveDesk(House.getInstance());
        RemoveChair removeChair=new RemoveChair(House.getInstance());
        Invoker invoker = new Invoker();
        House.getInstance().showFurnitures();
        for(;1==1;) {
            System.out.println("input command:(\"AddChair\",\"RemoveChair\",\"AddDesk\",\"RemoveDesk\", \"Exit\")");
            Scanner scanner = new Scanner(System.in);
            String key = scanner.nextLine();
            AbstractCommand command1= CommandFactory.getCommand(key);
            switch (key) {
                case "AddChair":
                    invoker.setCommand(addChair);
                    invoker.runCommand();
                    System.out.println("addChair successfully");
                    House.getInstance().showFurnitures();
                    break;
                case "RemoveChair":

                    invoker.setCommand(removeChair);
                    invoker.runCommand();
                    System.out.println("removeChair successfully");
                    House.getInstance().showFurnitures();
                    break;
                case "AddDesk":

                    invoker.setCommand(addDesk);
                    invoker.runCommand();
                    System.out.println("addDesk successfully");
                    House.getInstance().showFurnitures();
                    break;
                case "RemoveDesk":

                    invoker.setCommand(removeDesk);
                    invoker.runCommand();
                    System.out.println("removeDesk successfully");
                    House.getInstance().showFurnitures();
                    break;
                case "Exit":
                    System.exit(0);
                default:
                    System.out.println("Not Available Command in Command list");
            }
        }



    }
}
