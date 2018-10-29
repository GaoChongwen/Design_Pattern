package action.personAction;

import person.Employee;
import utils.Enum.EmployeeSkill;

/**
 * @author Chudi LAN
 * @version 2018-10-29
 * Design-Pattern: Template Method, Strategy
 */
public class EmployeeBreedAction extends EmployeeAction {
    public EmployeeBreedAction(Employee employee){
        super(employee);
    }

    @Override
    protected boolean checkTool() {
        // todo: check tools for breeding
        return false;
    }

    @Override
    protected boolean checkSkill() {
        return ((Employee)getTarget()).hasSkill(EmployeeSkill.breeding);
    }

    @Override
    public void doAction() {
        System.out.println("Breeding completed.");
    }

    private boolean checkFood(){
        // todo: check animal food
        return false;
    }
}
