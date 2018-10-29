package action.person;

import person.Employee;
import utils.Enum.EmployeeSkill;

/**
 * @author Chudi LAN
 * @version 2018-10-29
 * Design-Pattern: Template Method, Strategy
 */
public class EmployeeBreedAction extends EmployeeAction {
    private static EmployeeBreedAction instance = new EmployeeBreedAction();
    public static EmployeeBreedAction getInstance() {return instance;}
    private EmployeeBreedAction(){}

    /**
     * overwrite checkTool() to check food
     * @return
     */
    @Override
    protected boolean checkTool() {
        return checkFood();
    }

    @Override
    protected boolean checkSkill() {
        return ((Employee)getTarget()).hasSkill(EmployeeSkill.breeding);
    }

    private boolean checkFood(){
        // todo check animal food
        return false;
    }
}
