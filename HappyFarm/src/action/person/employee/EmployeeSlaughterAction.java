package action.person.employee;

import building.shed.AnimalHouse;

/**
 * @author Chudi LAN
 * @version 2018-10-30
 */
public class EmployeeSlaughterAction extends EmployeeBreedAction {
    private AnimalHouse animalHouse = null;

    private volatile static EmployeeSlaughterAction instance = new EmployeeSlaughterAction();
    private EmployeeSlaughterAction() {
        templateMethodOutput("constructor", "I am created.");
    }
    public static EmployeeSlaughterAction getInstance(){
        return instance;
    }

    @Override
    protected boolean checkTool() {
        templateMethodOutput("step 1_1_2. checkTool", "checking animal house.");
        if(animalHouse == null){
            System.out.println("ERROR: You haven't specified an animal house");
            return false;
        }
        return true;
    }

    @Override
    public void execute(boolean success) {
        if(success) {
            templateMethodOutput("step 1_2. execute", "slaughtering an animal.");
            strategyPatternOutput("EmployeeSlaughterAction: execute(true)", "slaughter action success strategy");
            animalHouse.slaughter();
        }else{
            strategyPatternOutput("EmployeeSlaughterAction: execute(false)", "slaughter action failed strategy");
        }
    }

    public EmployeeSlaughterAction setAnimalHouse(AnimalHouse animalHouse) {

        this.animalHouse = animalHouse;
        return instance;
    }
}
