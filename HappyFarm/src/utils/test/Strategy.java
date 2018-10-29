package utils.test;

import action.person.employee.EmployeeBreedAction;
import action.person.employee.EmployeeCultivateAction;
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
        EmployeeCultivateAction op1 = new EmployeeCultivateAction(ppp);
        EmployeeBreedAction op2 = new EmployeeBreedAction(ppp);

        op1.doAction();
        op2.doAction();
    }
}
