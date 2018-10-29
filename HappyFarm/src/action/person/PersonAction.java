package action.person;
import action.ActionStrategy;
import base.Action;

/**
 * @author Chudi LAN
 * @version 2018-10-28
 * Design-Pattern: Template Method, Strategy
 */
abstract public class PersonAction extends Action implements ActionStrategy {
    /**
     * Skeleton of the action
     * @return
     */
    @Override
    protected void doSomething() {
        System.out.println("Performing PersonAction.");
        if(checkCondition()){
            doAction();
        }
    }


    /**
     * check all conditions for the action.
     * @return true if conditions are satisfied.
     */
    protected abstract boolean checkCondition();

    abstract public void doAction();
}