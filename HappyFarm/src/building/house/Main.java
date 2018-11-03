package building.house;

import building.house.command.CommandUI;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to your house!");
        for(;1==1;) {
            System.out.println("As the master,what do you want to do?");
            System.out.println("[0]ViewHouseName [1]SetHouseNmae [2]View house information " +
                    "[3]View the furnitures [4]Add/Remove furniture [5]Exit");

            Scanner scanner = new Scanner(System.in);
            String key = scanner.nextLine();
            Pattern pattern = Pattern.compile("[0-5]");
            if (pattern.matcher(key).matches()) {
                switch (key) {
                    case "0":
                        House.getInstance().showHouseName();
                        break;
                    case "1":
                        House.getInstance().setHouseName();
                        break;
                    case "2":
                        House.getInstance().showHouse();
                        break;
                    case "3":
                        House.getInstance().showFurnitures();
                        break;
                    case "4":
                        CommandUI.CommandUI();
                        break;
                    case "5":
                        System.exit(0);
                        break;


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
