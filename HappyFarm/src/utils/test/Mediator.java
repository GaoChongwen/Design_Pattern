package utils.test;

import base.Person;
import person.Employee;
import utils.EmployeeSkill;

/**
 * @author Chudi LAN
 * Design-Pattern: Mediator
 * Scenario: cyl and ppp send messages through message board.
 */
public class Mediator {
    public static void main(String args[]){
        Employee cyl = new Employee("cyl", EmployeeSkill.cultivation, 5000);
        Employee ppp = new Employee("ppp", EmployeeSkill.breeding, 5000);

        cyl.leaveMessage("Hi pp~");
        ppp.leaveMessage("Hi ll~");
    }

}
