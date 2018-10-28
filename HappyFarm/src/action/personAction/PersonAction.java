package action.personAction;
import base.Action;
import base.Person;

/**
 * @author Chudi LAN
 * @version 2018-10-28
 * Design-Pattern: Template Method, Bridge
 */
abstract public class PersonAction extends Action{
    /** Register target person to execute the actions. */
    private Person targetPerson;

    PersonAction(Person targetPerson){
        this.setTargetPerson(targetPerson);
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
            execute();
            return true;
        }
        return false;
    }


    /**
     * check all conditions for the action.
     * @return true if conditions are satisfied.
     */
    protected abstract boolean checkCondition();

    /**
     * execute the exact action.
     */
    protected abstract void execute();
}