package base;

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
     * 运行 src.Action.
     * 设计模式: Template Method
     */
    public boolean run(){
        return doSomethoing();
    }

    /**
     * 内容由开发者决定
     */
    abstract protected boolean doSomethoing();

    /**
     * 返回对应action的描述, 比如 " XX正在播种"
     */
    abstract protected String getDescription();
}
