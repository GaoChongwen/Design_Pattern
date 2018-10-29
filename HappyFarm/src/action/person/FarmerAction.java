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

    abstract public void doAction();
    abstract protected boolean checkCondition();
}