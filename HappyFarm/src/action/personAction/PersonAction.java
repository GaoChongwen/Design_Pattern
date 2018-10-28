package action.personAction;
import base.Action;
import base.Person;

/**
 * @author Chudi LAN
 * @version 2018-10-28
 * Design-Pattern: Template Method, Bridge
 */
public class PersonAction extends Action{
    /** Register target person to execute the actions. */
    protected Person targetPerson;

    PersonAction(Person targetPerson){
        this.setTargerPerson(targetPerson);
    }

    public void setTargerPerson(Person targetPerson){
        this.targetPerson = targetPerson;
    }
    public Person getTargetPerson(){
        return this.targetPerson;
    }

    @Override
    protected boolean doSomething() {

        return false;
    }

    @Override
    protected String getDescription() {
        return null;
    }
}