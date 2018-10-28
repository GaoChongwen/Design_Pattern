package action.personAction;

import base.Person;
import person.Employee;
import utils.EmployeeSkill;

public class Breed extends EmployeeAction {
    public Breed(Employee employee){
        super(employee);
    }

    @Override
    protected boolean checkTool() {
        // todo: check tools for breeding
        return false;
    }

    @Override
    protected boolean checkSkill() {
        return ((Employee)getTargetPerson()).hasSkill(EmployeeSkill.breeding);
    }

    @Override
    public void doOperation() {
        System.out.println("Breeding completed.");
    }

    private boolean checkFood(){
        // todo: check animal food
        return false;
    }
}
