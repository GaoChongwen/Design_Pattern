package piewerTest.Memento;
import building.house.House;
import building.house.command.CommandUI;
import building.house.memento.CareTaker;
import building.house.memento.Originator;
import building.house.memento.Redo;
import building.house.memento.Undo;

import java.util.Scanner;
import java.util.regex.Pattern;
public class Test {
    public static void main(String[] args) {
        int index=-1;
        Originator originator=new Originator();
        CareTaker careTaker=new CareTaker();
        originator.setHouseName(House.getInstance().getHouseName());
        index++;
        //originator.setHouse(hou1);
        //originator.setHouse(house2);
        System.out.println(" careTaker[0] is "+originator.getHouseName());
        careTaker.add(originator.saveHouseNameToMemento());
        System.out.println("setHouseName ");
        House.getInstance().setHouseName();
        index++;
        originator.setHouseName(House.getInstance().getHouseName());
        System.out.println("careTaker[1] is "+originator.getHouseName());
        careTaker.add(originator.saveHouseNameToMemento());
        System.out.println("setHouseName");
        House.getInstance().setHouseName();
        index++;
        System.out.println("The currentHouseName are "+ House.getInstance().getHouseName());

        originator.setHouseName(House.getInstance().getHouseName());
        System.out.println("careTaker[2] is "+originator.getHouseName());
        careTaker.add(originator.saveHouseNameToMemento());
        System.out.println("setHouseName");
        House.getInstance().setHouseName();
        index++;
        originator.setHouseName(House.getInstance().getHouseName());
        System.out.println("careTaker[3] is "+originator.getHouseName());
        careTaker.add(originator.saveHouseNameToMemento());
        Redo redo=new Redo();
        Undo undo=new Undo();
        System.out.println(" .we are in careTaker["+index+"] ");
        for(;1==1;) {
            System.out.println("Test undo and redo?");
            System.out.println("[0]undo [1]redo [2]Exit ");

            Scanner scanner = new Scanner(System.in);
            String key = scanner.nextLine();
            Pattern pattern = Pattern.compile("[0-2]");
            if (pattern.matcher(key).matches()) {
                switch (key) {
                    case "0":
                        undo.Undo(careTaker,index);
                        if(index>0)
                            index--;
                        System.out.println(" .we are in careTaker["+index+"] ");
                        break;
                    case "1":
                        redo.Redo(careTaker,index);
                        if(index<careTaker.length()-1)
                            index++;

                        System.out.println(" .we are in careTaker["+index+"] ");
                        break;
                    case "2":
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
