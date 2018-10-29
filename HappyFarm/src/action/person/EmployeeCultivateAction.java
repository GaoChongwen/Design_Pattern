package action.person;

import person.Employee;
import utils.Enum.EmployeeSkill;

abstract public class EmployeeCultivateAction extends EmployeeAction{
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
        return ((Employee)getTarget()).hasSkill(EmployeeSkill.cultivation);
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
