package test.mediator;

import person.Employee;
import utils.Enum.EmployeeSkill;

/**
 * @author Chudi LAN
 * Scenario: cyl and ppp leave messages through message board.
 */
public class Mediator {
    public static void main(String args[]){
        Employee cyl = new Employee("cyl", EmployeeSkill.cultivation, 5000);
        Employee ppp = new Employee("ppp", EmployeeSkill.breeding, 5000);

        cyl.leaveMessage("Hi pp~");
        ppp.leaveMessage("Hi ll~");

//        MessageBoard.showMessages();
    }

}
