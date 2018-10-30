package designPatterns.templateMethod.action;

import base.FarmObj;
import designPatterns.templateMethod.utils.ActionStrategy;

/**
 * @author Chudi LAN
 * Disign-Pattern: Template Method
 *
 * note: When assigning a task to an employee, make sure to implement setTarget() before run().
 *
 */
abstract public class Action implements ActionStrategy {
    /**
     * Target: invoker of src.Action
     * The target will be set in the runAction() method of FarmObj.java with the 'setTarget' method.
     */
    private static FarmObj Target = null;

    /**
     * Getter & Setter for Target
     */
    protected FarmObj getTarget(){
        return Target;
    }
    public static void setTarget(FarmObj target) {
        Target = target;
    }

    protected Action() {}

    /**
     * run src.Action.
     * Design-Pattern: Template Method
     */
    public void doAction(){
        if(!checkTarget()){
            System.out.println("Error: No target is set to this action.");
            return;
        }
         doSomething();
    }

    /**
     * content will be decided by developers.
     */
    abstract protected void doSomething();

    private boolean checkTarget(){
        return Target==null;
    }
}
