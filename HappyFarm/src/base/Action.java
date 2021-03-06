package base;

import action.ActionStrategy;
import utils.Enum.DesignPatternMode;

/**
 * @author Chudi LAN
 * Disign-Pattern: Template Method
 *
 * note: When assigning a task to an employee, make sure to implement setTarget() before run().
 *
 */
abstract public class Action implements ActionStrategy {
    static public DesignPatternMode designPatternMode=DesignPatternMode.Default;
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
    public Action setTarget(FarmObj target) {
        this.Target = target;
        return this;
    }

    protected Action() {

    }

    /**
     * run src.Action.
     * Design-Pattern: Template Method
     */
    public boolean doAction(){
        switch (designPatternMode){
            case TemplateMethodPattern:
                System.out.println("[ Template Method starts ]");
                templateMethodOutput("step 0. doAction","an action is performing.");
                break;
            case Default:
                break;
            case StrategyPattern:
                System.out.println("[ Strategy Pattern]");
                strategyPatternOutput("Action: doAction","strategy invoked");
                break;
                default:
                    System.out.println("Invalid mode.");
                    return false;
        }

        return (doSomething());  // step 1 doSomething();

    }

    /**
     * content will be decided by developers.
     */
    abstract protected boolean doSomething();

    protected void templateMethodOutput(String methodName, String actionDesc) {
        if(designPatternMode==DesignPatternMode.TemplateMethodPattern)
            System.out.println(methodName+ "(): " +actionDesc);
    }

    protected void strategyPatternOutput(String methodName, String actionDesc){
        if(designPatternMode==DesignPatternMode.StrategyPattern)
            System.out.println(methodName+ "(): " +actionDesc);
    }

    protected void defaultOutput(String methodName, String actionDesc){
        if(designPatternMode==DesignPatternMode.Default)
            System.out.println(methodName+ "(): " +actionDesc);
    }

    protected void bridgeOutput(String methodName, String actionDesc){
        if(designPatternMode==DesignPatternMode.BridgePattern)
            System.out.println(methodName+ "(): " +actionDesc);
    }

    protected String getClassName() {
        return "Action";
    }
    protected String getObjectID() {
        return "";
    }

    public static void setDesignPatternMode(DesignPatternMode designPatternMode){
        Action.designPatternMode = designPatternMode;
    }
}
