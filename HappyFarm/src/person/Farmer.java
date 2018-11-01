package person;
import action.person.farmer.FarmerBuyAction;
import action.person.farmer.FarmerProcessAction;
import action.person.farmer.FarmerSellAction;
import action.person.farmer.FarmerUseLandAdaptorAction;
import base.FarmObj;
import base.Person;
import building.farmland.FarmLand;
import factory.EmployeeFactory;
import propComp.props.landAdaptor.LandAdaptor;

/**
 * @author Chudi LAN
 * Design-Pattern：Singleton, Double checked locking
 */
public class Farmer extends Person implements FarmerOperationAPI{
    private volatile static Farmer ourInstance = new Farmer();
    public static Farmer getInstance() { return ourInstance; }
    private Farmer(){ setName("Farmer"); }

    @Override
    public void changeName(String name) {
        setName(name);
        System.out.println("The farmer has changed name to "+getName());
    }

    @Override
    public boolean buy(String itemName) {
        return FarmerBuyAction.getInstance().setItemName(itemName).setCount(1).doAction();
    }

    @Override
    public boolean buy(String itemName, int count) {
        return FarmerBuyAction.getInstance().setItemName(itemName).setCount(count).doAction();
    }

    @Override
    public boolean sell(String itemName) {
        return FarmerSellAction.getInstance().setItemName(itemName).doAction();
    }

    @Override
    public boolean sell(String itemName, int count) {
        for(int i = 0 ; i < count; i++){
            if(!sell(itemName))
                return false;
        }
        return true;
    }

    @Override
    public boolean process(FarmObj farmObj) {
        return FarmerProcessAction.getInstance().setFarmObj(farmObj).doAction();
    }

    @Override
    public boolean useLandAdapter(FarmLand farmLand, LandAdaptor landAdapter) {
        return FarmerUseLandAdaptorAction.getInstance().setLandAdaptor(landAdapter).setFarmLand(farmLand).doAction();
    }

    @Override
    public Employee getEmployee(int id) {
        return EmployeeFactory.getInstance().getEmpolyee(id);
    }
}
