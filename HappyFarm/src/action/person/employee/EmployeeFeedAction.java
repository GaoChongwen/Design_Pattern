package action.person.employee;

import base.animal.Animal;

/**
 * @author Chudi LAN
 * @version 2018-10-29
 */
public class EmployeeFeedAction extends EmployeeBreedAction {
//    private static AnimalFood animalFood = null;
    private static Animal animal;

    private volatile static EmployeeFeedAction instance = new EmployeeFeedAction();
    private EmployeeFeedAction(){}
    public static EmployeeFeedAction getInstance(){
//        animalFood = null;
        animal = null;
        setTarget(null);
        return instance;
    }

    public static void setAnimal(Animal animal) {
        EmployeeFeedAction.animal = animal;
    }

//    public static void setAnimalFood(AnimalFood animalFood) {
//        EmployeeFeedAction.animalFood = animalFood;
//    }

    @Override
    protected boolean checkTool() {
        if(animal == null){
            System.out.println("You haven't specified an animal to feed.");
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
//        animal.eat(animalFood);
        System.out.println("Feeding complete.");
    }
}
