package action.person.employee;

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
        templateMethodOutput("constructor", "I am created.");
    }
    public static EmployeeFeedAction getInstance(){
        return instance;
    }

    public void setAnimalHouse(AnimalHouse animalHouse) {
        templateMethodOutput("setAnimalHouse", "an animal house is specified.");
        this.animalHouse = animalHouse;
    }

//    public static void setAnimalFood(AnimalFood animalFood) {
//        EmployeeFeedAction.animalFood = animalFood;
//    }

    @Override
    protected boolean checkTool() {
        templateMethodOutput("step 1_1_2. checkTool", "checking animal house and animal food");
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
