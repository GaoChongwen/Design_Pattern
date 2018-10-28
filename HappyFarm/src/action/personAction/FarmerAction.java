package action.personAction;

import person.Farmer;

abstract public class FarmerAction extends PersonAction{
    FarmerAction(){
        super(Farmer.getInstance());
    }

    @Override
    protected boolean doSomething() {
        return super.doSomething();
    }
}