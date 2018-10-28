package action.personAction;

import base.Person;
import person.Employee;
import utils.EmployeeSkill;

public class Cultivate extends EmployeeAction {
    public Cultivate(Person targetPerson){
        super(targetPerson);
    }


    @Override
    protected boolean checkTool() {
        return false;
    }

    @Override
    protected boolean checkSkill() {
        return ((Employee)getTargetPerson()).hasSkill(EmployeeSkill.cultivation);
    }

    @Override
    protected void execute(){
        System.out.println("Cultivation completed.");
    }

    private boolean checkSeed(){
        return false;
    }

}
