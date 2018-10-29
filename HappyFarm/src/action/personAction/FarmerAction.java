package action.personAction;

import person.Farmer;

abstract public class FarmerAction extends PersonAction{
    protected FarmerAction(){
        super(Farmer.getInstance());
    }

    abstract public void doAction();

    @Override
    protected boolean checkCondition() {
        return false;
    }
}