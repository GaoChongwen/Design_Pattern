package base;

import action.ActionStrategy;
import utils.Output;

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
    private FarmObj Target = null;

    /**
     * Getter & Setter for Target
     */
    protected FarmObj getTarget(){
        return Target;
    }
    public void setTarget(FarmObj target) {
        this.Target = target;
    }

    protected Action() {}

    /**
     * run src.Action.
     * Design-Pattern: Template Method
     */
    public void doAction(){
        System.out.println("\n< Template Method starts >");
        output("doAction","an action is performing.");
        doSomething();
        System.out.println("< Template Method ends >\n");
    }

    /**
     * content will be decided by developers.
     */
    abstract protected void doSomething();

    public void output(String methodName, String actionDesc) {
        System.out.println(this.getClassName()+": "+methodName+ "(): " +actionDesc);
    }

    protected String getClassName() {
        return "Action";
    }
    protected String getObjectID() {
        return "";
    }
}
