package utils.test;

import action.personAction.Breed;
import action.personAction.Cultivate;
import person.Employee;
import utils.Enum.EmployeeSkill;

/**
 * @author Chudi LAN
 * @version 2018-10-28
 * Scenario: dynamically bind different operations to Cultivate and Breed
 */
public class Strategy {
    public static void main(String args[]) {
        System.out.println("Testing Strategy Pattern");
        Employee ppp = new Employee("ppp", EmployeeSkill.breeding, 5000);
        Cultivate op1 = new Cultivate(ppp);
        Breed op2 = new Breed(ppp);

        op1.doOperation();
        op2.doOperation();
    }
}
