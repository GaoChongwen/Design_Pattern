package action.person.employee;

import base.Action;
import base.FarmObj;
import building.shed.AnimalHouse;
import person.Employee;
import utils.Enum.EmployeeSkill;

/**
 * @author Chudi LAN
 * @version 2018-10-29
 */
public class EmployeeFeedAction extends EmployeeBreedAction {
    private AnimalHouse animalHouse;

    private volatile static EmployeeFeedAction instance = new EmployeeFeedAction();
    private EmployeeFeedAction(){
        templateMethodOutput("constructor", "I am created.");
    }
    public static EmployeeFeedAction getInstance(){
        return instance;
    }

    public EmployeeFeedAction setAnimalHouse(AnimalHouse animalHouse) {
        templateMethodOutput("setAnimalHouse", "an animal house is specified.");
        this.animalHouse = animalHouse;
        return instance;
    }


    @Override
    protected boolean checkTool() {
        templateMethodOutput("step 1_1_2. checkTool", "checking animal house.");
        if(animalHouse == null){
            templateMethodOutput("step 1_1_2. checkTool", "no animal house is specified.");
            return false;
        }
        return true;
    }

    @Override
    public boolean execute(boolean success) {
        if(success) {
            templateMethodOutput("step 1_2. execute", "feeding an animal.");
            strategyPatternOutput("EmployeeFeedAction: execute(true)", "feed action success strategy");
            animalHouse.feed();
            return true;
        }
        else {
            strategyPatternOutput("EmployeeFeedAction: execute(false)", "feed action failed strategy");
            return false;
        }
    }

}
