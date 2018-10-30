package action.person.farmer;

import base.Item;

/**
 * @author Chudi LAN
 * @version 2018-10-29
 * Design-Pattern: Template Method
 */
public class FarmerProcessAction extends FarmerAction{
    private static Item item = null;

    private volatile static FarmerProcessAction instance = new FarmerProcessAction();
    private FarmerProcessAction(){
        super();
        System.out.println("FarmerProcessAction instance is created.");
    }
    public static FarmerProcessAction getInstance(){
        item = null;
        return instance;
    }

    /** validate the item to process
     *
     *  Precondition of execute():
     *      1. setItem()
     */
    @Override
    protected boolean checkCondition() {
        System.out.println("FarmerProcessAction instance is checking conditions.");
        if(item == null){
            System.out.println("You haven't specified which item to process.");
            return false;
        }
        return true;
    }


    @Override
    protected void execute() {
        System.out.println("FarmerProcessAction instance is executing.");
        Process.getInstance().process(item);
    }

    public static void setItem(Item item) {
        System.out.println("Item "+item.getName()+" is set to FarmerProcessAction.");
        FarmerProcessAction.item = item;
    }
}
