package action.person.employee;

import action.person.PersonAction;
import base.Person;

/**
 * Design-Pattern: Template Method
 *
 * <p>The template methods <code>checkTool()</code> and <p>checkSkill()</p> indicates
 * that Employee can only execute an action if the tool and skill satisfy the task.</p>
 *
 * @author Chudi LAN
 * @version 2018-10-28
 *
 */
abstract public class EmployeeAction extends PersonAction {
    @Override
    protected boolean checkCondition() {
        /* 1. check employee assigned. */
        if(getTarget()==null){
            System.out.println("You haven't assigned an employee.");
            return false;
        }
        /* 2. check employee's skill. */
        if(!checkSkill()){
            return false;
        }
        /* 3. check tool. */
        if(!checkTool()){
            return false;
        }
        return true;
    }

    abstract protected boolean checkTool();
    abstract protected boolean checkSkill();
    abstract protected void execute();
}
