package utils.test;

import person.Employee;
import person.Farmer;
import utils.EmployeeSkill;
import singleton.MessageBoard;

/**
 * @author Chudi LAN
 * Scenario:
 */
public class Observer {
    public static void main(String[] args){
        MessageBoard messageBoard = MessageBoard.getInstance();
        Employee cyl = new Employee("cyl", EmployeeSkill.cultivation, 5000);
        Employee ppp = new Employee("ppp", EmployeeSkill.breeding, 5000);
        Farmer farmer = Farmer.getInstance();
        messageBoard.addObserver(cyl);
        messageBoard.addObserver(ppp);
        messageBoard.addObserver(farmer);

        cyl.leaveMessage("Hi pp~");
        ppp.leaveMessage("Hi ll~");
    }
}
