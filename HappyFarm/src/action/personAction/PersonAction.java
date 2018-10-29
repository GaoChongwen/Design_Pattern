package action.personAction;
import base.Action;
import base.Person;

/**
 * @author Chudi LAN
 * @version 2018-10-28
 * Design-Pattern: Template Method, Strategy
 */
abstract public class PersonAction extends Action implements ActionStrategy{
    /** Register target person to execute the actions. */
    private Person targetPerson;

    PersonAction(Person targetPerson){
        super(targetPerson);
    }

    public void setTargetPerson(Person targetPerson){
        this.targetPerson = targetPerson;
    }
    public Person getTargetPerson(){
        return this.targetPerson;
    }

    /**
     * Skeleton of the action
     * @return
     */
    @Override
    protected boolean doSomething() {
        System.out.println("Performing PersonAction.");
        if(checkCondition()){
            doOperation();
            return true;
        }
        return false;
    }


    /**
     * check all conditions for the action.
     * @return true if conditions are satisfied.
     */
    protected abstract boolean checkCondition();

}