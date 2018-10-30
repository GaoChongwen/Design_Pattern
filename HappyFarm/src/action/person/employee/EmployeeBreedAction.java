package action.person.employee;

import action.person.employee.EmployeeAction;
import person.Employee;
import utils.Enum.EmployeeSkill;

/**
 * @author Chudi LAN
 * @version 2018-10-29
 * Design-Pattern: Template Method, Strategy
 */
public abstract class EmployeeBreedAction extends EmployeeAction {
    @Override
    abstract protected boolean checkTool();

    @Override
    protected boolean checkSkill() {
        System.out.println("Checking breeding skill.");
        if(!((Employee)getTarget()).hasSkill(EmployeeSkill.breeding)){
            System.out.println("Employee "+getTarget().getName()+" doesn't have breeding skill.");
            return false;
        }
        return true;
    }

    abstract protected void execute();
}
