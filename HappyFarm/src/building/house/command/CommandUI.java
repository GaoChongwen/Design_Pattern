package building.house.command;

import building.house.House;
import building.house.NullObject.CommandModelUI;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @project: command
 * @description: 测试demo
 * @designPatter: Command
 * @author: Chen Zhi
 * @create: 2018-10-28
 **/
public class CommandUI {
    public static void CommandUI() {
        //初始化命令
        AddChair addChair=new AddChair(House.getInstance());
        AddDesk addDesk=new AddDesk(House.getInstance());
        RemoveDesk removeDesk=new RemoveDesk(House.getInstance());
        RemoveChair removeChair=new RemoveChair(House.getInstance());
        Invoker invoker = new Invoker();

        for(;1==1;) {
            House.getInstance().showFurnitures();
            System.out.println("what do you want to do? remove or add furniture?");
            System.out.println("[0]Add Chiar [1]Remove Chair [2]Add Desk [3]Remove Chair [4]CommandModel [5]Exit");

            Scanner scanner = new Scanner(System.in);
            String key = scanner.nextLine();
            Pattern pattern = Pattern.compile("[0-5]");
            if (pattern.matcher(key).matches()) {
                switch (key) {
                    case "0":
                        House.getInstance().showFurnitures();
                        invoker.setCommand(addChair);
                        invoker.runCommand();
                        System.out.println("addChair successfully");
                        break;
                    case "1":
                        House.getInstance().showFurnitures();
                        invoker.setCommand(removeChair);
                        invoker.runCommand();
                        System.out.println("removeChair successfully");
                        break;
                    case "2":
                        House.getInstance().showFurnitures();
                        invoker.setCommand(addDesk);
                        invoker.runCommand();
                        System.out.println("addChair successfully");
                        break;
                    case "3":
                        House.getInstance().showFurnitures();
                        invoker.setCommand(removeDesk);
                        invoker.runCommand();
                        System.out.println("removeChair successfully");
                        break;
                    case "4":
                        CommandModelUI.commandModelUI();
                    case "5":
                        return;
                    default:
                        System.out.println("Error enter");
                }
            }
            else {
                System.out.println("-----------------------------------------------------------------------------------------");
                System.out.println("Error! Please type again! ");
                System.out.println("-----------------------------------------------------------------------------------------");
                System.out.println("\n");
            }
        }


    }
}
