package action.person;

import base.Person;

/**
 * @author Chudi LAN
 * @version 2018-10-28
 *
 * Design-Pattern: Template Method
 *
 *      Employees can only execute an action if the tool and skill satisfy the task.
 *
 *
 */
abstract public class EmployeeAction extends PersonAction {
    @Override
    protected boolean checkCondition() {
        /* 1. check employee's skill. */
        if(!checkSkill()){
            System.out.println("Employee "+((Person)getTarget()).getName()+" doesn't have the skill.");
            return false;
        }
        /* 2. check corresponding tool. */
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
