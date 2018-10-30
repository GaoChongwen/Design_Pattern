package action.person.employee;

import building.shed.AnimalHouse;

public class EmployeeSlaughterAction extends EmployeeBreedAction {
    private static AnimalHouse animalHouse = null;

    private volatile static EmployeeSlaughterAction instance = new EmployeeSlaughterAction();
    private EmployeeSlaughterAction() {}
    public static EmployeeSlaughterAction getInstance(){
        animalHouse = null;
        return instance;
    }

    @Override
    protected boolean checkTool() {
        if(animalHouse == null){
            System.out.println("You haven't specified an animal house");
            return false;
        }
        return true;
    }

    @Override
    protected void execute() {
        animalHouse.slaughter();
    }
}
