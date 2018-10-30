package action.person.employee;

import building.shed.AnimalHouse;

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

    public void setAnimalHouse(AnimalHouse animalHouse) {
        templateMethodOutput("setAnimalHouse", "an animal house is specified.");
        this.animalHouse = animalHouse;
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
    protected void execute() {
        templateMethodOutput("step 1_2. execute", "feeding an animal.");
        animalHouse.feed();
    }

    protected String getClassName() {
        return "EmployeeFeedAction";
    }
    protected String getObjectID() {
        return "instance";
    }
}
