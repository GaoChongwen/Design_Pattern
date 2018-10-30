package action.person.employee;

import building.shed.AnimalHouse;

/**
 * @author Chudi LAN
 * @version 2018-10-30
 */
public class EmployeeSlaughterAction extends EmployeeBreedAction {
    private static AnimalHouse animalHouse = null;

    private volatile static EmployeeSlaughterAction instance = new EmployeeSlaughterAction();
    private EmployeeSlaughterAction() {
        output("constructor", "I am created.");
    }
    public static EmployeeSlaughterAction getInstance(){
        animalHouse = null;
        return instance;
    }

    @Override
    protected boolean checkTool() {
        output("checkTool", "checking animal house.");
        if(animalHouse == null){
            System.out.println("ERROR: You haven't specified an animal house");
            return false;
        }
        return true;
    }

    @Override
    protected void execute() {
        output("execute", "slaughtering an animal.");
        animalHouse.slaughter();
    }

    protected String getClassName() {
        return "EmployeeSlaughterAction";
    }
    protected String getObjectID() {
        return "instance";
    }
}
