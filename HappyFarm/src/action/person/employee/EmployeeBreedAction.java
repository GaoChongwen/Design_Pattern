package action.person.employee;

import person.Employee;
import utils.Enum.EmployeeSkill;

/**
 * @author Chudi LAN
 * @version 2018-10-29
 * Design-Pattern: Template Method, Strategy
 */
public abstract class EmployeeBreedAction extends EmployeeAction {

    @Override
    protected boolean checkSkill() {
        templateMethodOutput("step 1_1_1. checkSkill","checking breeding skill.");
        if(!((Employee)getTarget()).hasSkill(EmployeeSkill.breeding)){
            System.out.println("Employee "+getTarget().getName()+" doesn't have breeding skill.");
            return false;
        }
        return true;
    }

    @Override
    abstract protected boolean checkTool();
    abstract protected void execute();

    protected String getClassName() {
        return "EmployeeBreedAction";
    }
    protected String getObjectID() {
        return "";
    }
}
