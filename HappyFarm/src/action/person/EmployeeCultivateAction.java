package action.person;

import person.Employee;
import utils.Enum.EmployeeSkill;

abstract public class EmployeeCultivateAction extends EmployeeAction{

    @Override
    protected boolean checkSkill() {
        if(!((Employee)getTarget()).hasSkill(EmployeeSkill.cultivation)){
            System.out.println("Employee "+((Employee) getTarget()).getName()+" doesn't have cultivation skill.");
            return false;
        }
        return true;
    }

    abstract protected boolean checkTool();

    abstract protected void execute();
}
