package test.mediator;

import person.Employee;
import person.Farmer;
import singleton.MessageBoard;
import utils.Enum.DesignPatternMode;
import utils.Enum.EmployeeSkill;

import javax.print.attribute.standard.Media;

/**
 * @author Chudi LAN
 * Scenario: employee and the farmer leave messages through message board.
 */
public class Mediator {
    public static void main(String args[]){
        Farmer farmer = Farmer.getInstance();
        Employee emp1 = new Employee("Mary", EmployeeSkill.cultivation, 5000);
        Employee emp2 = new Employee("Tom", EmployeeSkill.breeding, 5000);
        MessageBoard messageBoard = MessageBoard.getInstance();
        MessageBoard.setDesignPatternMode(DesignPatternMode.MediatorPattern);

        System.out.println("" +
                "\n====================================================================" +
                "\n Scenario:" +
                "\n     The Farmer, Employee Mary, Employee Tom  " +
                "\n     leave messages through message board." +
                "\n====================================================================\n");

        farmer.leaveMessage("I am the farmer, welcome to my farm.");
        emp1.leaveMessage("Hello, I am mary.");
        emp2.leaveMessage("Hello, mary.");

        String expression = "234 + 367 ";
        farmer.leaveMessage("calculate: "+expression+" = "+farmer.calculate(expression));
    }

}
