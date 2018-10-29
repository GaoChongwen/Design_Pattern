package action.person;

import person.Farmer;

/**
 * @author Chudi LAN
 * @version 2018-10-29
 */
abstract public class FarmerAction extends PersonAction{
    protected FarmerAction(){
        setTarget(Farmer.getInstance());
    }

    abstract protected boolean checkCondition();

    abstract protected void execute();
}