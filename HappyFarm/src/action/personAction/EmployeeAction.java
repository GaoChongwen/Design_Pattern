package action.personAction;

import base.Action;
import base.Person;
import utils.EmployeeSkill;

/**
 * @author Chudi LAN
 * @version 2018-10-28
 * Design-Pattern: Template Method
 */
public class EmployeeAction extends PersonAction {

    public EmployeeAction(Person targetPerson){
        super(targetPerson);
    }

    /**
     *
     * @return
     */
    @Override
    protected boolean doSomething() {
        return super.doSomething();
    }
}
