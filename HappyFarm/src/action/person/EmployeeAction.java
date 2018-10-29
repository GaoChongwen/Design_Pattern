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
        /** 1. check employee assigned. */
        if(getTarget()==null){
            System.out.println("You haven't assigned an employee.");
            return false;
        }
        /* 2. check employee's skill. */
        if(!checkSkill()){
            return false;
        }
        /* 2. check corresponding tool. */
        if(!checkTool()){
            return false;
        }
        return true;
    }

    abstract protected boolean checkTool();
    abstract protected boolean checkSkill();
    abstract protected void execute();
}
