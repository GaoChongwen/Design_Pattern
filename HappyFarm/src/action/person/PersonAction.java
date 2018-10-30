package action.person;
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
        templateMethodOutput("step 1. doSomething","a person is performing an action.");
        if(checkCondition()){           // step 1_1
            execute();                  // step 1_2
        }else {
            templateMethodOutput("step 1_2. execute", "failed to execute.");
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