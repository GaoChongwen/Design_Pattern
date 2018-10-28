package base;

/**
 * @author Chudi LAN
 * Design-Pattern: Template Method
 */
abstract public class Action {
    /**
     * Target: invoker of src.Action
     * The target will be set in the runAction() method of FarmObj.java with the 'setTarget' method.
     */
    protected FarmObj Target;

    /**
     * Getter & Setter for Target
     */
    protected FarmObj getTarget(){
        return Target;
    }
    protected void setTarget(FarmObj Target) {
        this.Target = Target;
    }

    protected Action() {}

    /**
     * run src.Action.
     * Design-Pattern: Template Method
     */
    public boolean run(){
        return doSomething();
    }

    /**
     * content will be determined by developers.
     */
    abstract protected boolean doSomething();

    /**
     * return the descriptions of the action, like " is harvesting."
     */
    abstract protected String getDescription();
}
