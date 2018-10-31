package base;

import action.ActionStrategy;

/**
 * @author Chudi LAN
 * Disign-Pattern: Template Method
 *
 * note: When assigning a task to an employee, make sure to implement setTarget() before run().
 *
 */
abstract public class Action implements ActionStrategy {
    static private boolean templateMethodMode;
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

    protected Action() {
        templateMethodMode = false;
    }

    /**
     * run src.Action.
     * Design-Pattern: Template Method
     */
    public void doAction(){
        if(templateMethodMode)System.out.println("[ Template Method starts ]");
        templateMethodOutput("step 0. doAction","an action is performing.");

        doSomething();

        if(templateMethodMode)System.out.println("[ Template Method ends ]\n");
    }

    /**
     * content will be decided by developers.
     */
    abstract protected void doSomething();

    public void templateMethodOutput(String methodName, String actionDesc) {
        if(templateMethodMode){
        System.out.println(methodName+ "(): " +actionDesc);
        }
    }

    protected String getClassName() {
        return "Action";
    }
    protected String getObjectID() {
        return "";
    }

    public static void setTemplateMethodMode(boolean templateMethodMode) {
        Action.templateMethodMode = templateMethodMode;
    }
}
