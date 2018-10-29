package action.personAction;

import person.Employee;
import utils.Enum.EmployeeSkill;

public class Cultivate extends EmployeeAction{
    public Cultivate(Employee employee){
        super(employee);
    }


    @Override
    protected boolean checkTool() {
        if(!checkSeed()){
            return false;
        }
        // todo: check tools for cultivation
        return true;
    }

    @Override
    protected boolean checkSkill() {
        return ((Employee)getTargetPerson()).hasSkill(EmployeeSkill.cultivation);
    }

    @Override
    public void doOperation() {
        System.out.println("Cultivation completed.");
    }


    private boolean checkSeed(){
        // todo: check seeds
        return false;
    }

}
