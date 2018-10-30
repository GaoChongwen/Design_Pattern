package action.person.farmer;

import base.Item;

/**
 * @author Chudi LAN
 * @version 2018-10-29
 * Design-Pattern: Template Method
 */
public class FarmerProcessAction extends FarmerAction{
    private Item item = null;

    private volatile static FarmerProcessAction instance = new FarmerProcessAction();
    private FarmerProcessAction(){
        super();
        output("constructor","I am created.");
    }
    public static FarmerProcessAction getInstance(){
        return instance;
    }

    /** validate the item to process
     *
     *  Precondition of execute():
     *      1. setItem()
     */
    @Override
    protected boolean checkCondition() {
        output("checkCondition", "checking item.");
        if(item == null){
            System.out.println("ERROR: You haven't specified which item to process.");
            return false;
        }
        return true;
    }


    @Override
    protected void execute() {
        output("execute","processing an item.");
//        Process.getInstance().process(item);
    }

    public void setItem(Item item) {
        output("setItem","an item is specified.");
        this.item = item;
    }


    protected String getClassName() {
        return "FarmerProcessAction";
    }
    protected String getObjectID() {
        return "instance";
    }
}
