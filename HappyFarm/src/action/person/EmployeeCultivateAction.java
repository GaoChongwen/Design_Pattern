package action.personAction;

import person.Employee;
import utils.Enum.EmployeeSkill;

public class EmployeeCultivateAction extends EmployeeAction{
    public EmployeeCultivateAction(Employee employee){
        super(employee);
    }


    @Override
    protected boolean checkTool() {
        if(!checkSeed()){
            return false;
        }
        if(!checkCultivationTool()){
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
    public void doAction() {
        System.out.println("Cultivation completed.");
    }


    private boolean checkSeed(){
        // todo: check seeds
        return false;
    }

    protected boolean checkCultivationTool(){
        // todo check tools for cultivation
        return false;
    }

}
