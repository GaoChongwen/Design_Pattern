package action.personAction;

import base.Person;
import person.Employee;

/**
 * @author Chudi LAN
 * @version 2018-10-28
 * Design-Pattern: Template Method
 * Employees can only execute an action if the tool and skill satisfy the task.
 */
abstract public class EmployeeAction extends PersonAction {
    @Override
    protected boolean checkCondition() {
        if(!checkSkill()){
            System.out.println("Employee "+((Person)getTarget()).getName()+" doesn't have the skill.");
            return false;
        }
        if(!checkTool()){
            System.out.println("There's no enough tool.");
            return false;
        }
        return true;
    }

    abstract protected boolean checkTool();
    abstract protected boolean checkSkill();

    abstract public void doAction();
}
