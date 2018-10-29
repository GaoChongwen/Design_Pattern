package utils.test;

import action.person.employee.EmployeeCultivateAction;
import base.Action;
import person.Employee;
import utils.Enum.EmployeeSkill;

/**
 * @author Chudi LAN
 * @version 2018-10-28
 * Scenario:
 */
public class TemplateMethod {
    public static void main(String args[]){
        Employee cyl = new Employee("cyl", EmployeeSkill.cultivation, 5000);

        Action cultivate = new EmployeeCultivateAction(cyl);

        cultivate.run();
    }
}
