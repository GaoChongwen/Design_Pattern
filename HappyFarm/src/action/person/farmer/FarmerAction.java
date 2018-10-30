package action.person.farmer;

import action.person.PersonAction;

/**
 * @author Chudi LAN
 * @version 2018-10-29
 */
abstract public class FarmerAction extends PersonAction {
    protected FarmerAction() {
        templateMethodOutput("constructor","I am created.");
    }

    abstract protected boolean checkCondition();
    abstract protected void execute();

    protected String getClassName() {
        return "FarmerAction";
    }
    protected String getObjectID() {
        return "";
    }

}
