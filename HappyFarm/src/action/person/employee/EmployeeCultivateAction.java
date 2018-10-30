package action.person.employee;

import action.person.employee.EmployeeAction;
import person.Employee;
import utils.Enum.EmployeeSkill;

/**
 * The class <code>EmployeeCultivateAction</code> is also a Template Method Pattern.
 * It is not instantiable.
 *
 * The EmployeeCultivateAction only checks the cultivation skill, but cannot decide the exact
 * tools, thus the tool is checked in the realization of subclasses.
 *
 * <p>It realizes the {@link EmployeeAction#checkSkill()}, but leave the {@link #checkTool()}
 * method abstract to subclasses.</p>
 *
 * @author Chudi LAN
 * @version 2018-10-30
 */
abstract public class EmployeeCultivateAction extends EmployeeAction {
    /**
     * @see EmployeeAction#checkSkill()
     *y
     * @return whether employee
     */
    @Override
    protected boolean checkSkill() {
        output("checkSkill", "checking cultivation skill.");
        if(!((Employee)getTarget()).hasSkill(EmployeeSkill.cultivation)){
            System.out.println("Employee "+((Employee) getTarget()).getName()+" doesn't have cultivation skill.");
            return false;
        }
        return true;
    }

    abstract protected boolean checkTool();
    abstract protected void execute();

    protected String getClassName() {
        return "EmployeeCultivateAction";
    }
    protected String getObjectID() {
        return "";
    }
}
