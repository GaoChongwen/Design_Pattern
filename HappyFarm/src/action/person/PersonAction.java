package action.person;
import action.ActionStrategy;
import base.Action;

/**
 * @author Chudi LAN
 * @version 2018-10-28
 * Design-Pattern: Template Method, Strategy
 */
abstract public class PersonAction extends Action{
    /**
     * Skeleton of the action
     * @return
     */
    @Override
    protected void doSomething() {
        output("doSomething","someone is performing an action.");
        if(checkCondition()){
            execute();
        }
    }


    /**
     * check all conditions for the action.
     * @return true if conditions are satisfied.
     */
    protected abstract boolean checkCondition();

    abstract protected void execute();

    protected String getClassName() {
        return "Person Action";
    }


    protected String getObjectID() {
        return "";
    }
}