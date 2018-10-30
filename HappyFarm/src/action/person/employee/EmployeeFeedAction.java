package action.person.employee;

import base.animal.Animal;
import building.shed.AnimalHouse;

/**
 * @author Chudi LAN
 * @version 2018-10-29
 */
public class EmployeeFeedAction extends EmployeeBreedAction {
//    private static AnimalFood animalFood = null;
    private AnimalHouse animalHouse;

    private volatile static EmployeeFeedAction instance = new EmployeeFeedAction();
    private EmployeeFeedAction(){
        output("constructor", "I am created.");
    }
    public static EmployeeFeedAction getInstance(){
        return instance;
    }

    public void setAnimalHouse(AnimalHouse animalHouse) {
        output("setAnimalHouse", "an animal house is specified.");
        this.animalHouse = animalHouse;
    }

//    public static void setAnimalFood(AnimalFood animalFood) {
//        EmployeeFeedAction.animalFood = animalFood;
//    }

    @Override
    protected boolean checkTool() {
        output("checkTool", "checking animal house and animal food");
        if(animalHouse == null){
            System.out.println("ERROR: You haven't specified an animal to feed.");
            return false;
        }
//        if(animalFood == null){
//            System.out.println("You haven't specified a food.");
//            return false;
//        }
        return true;
    }

    @Override
    protected void execute() {
        output("execute", "feeding an animal.");
        animalHouse.feed();
    }

    protected String getClassName() {
        return "EmployeeFeedAction";
    }
    protected String getObjectID() {
        return "instance";
    }
}
