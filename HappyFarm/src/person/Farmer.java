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
    public void buy(String itemName) {
        FarmerBuyAction.getInstance().setItemName(itemName).setCount(1).doAction();
    }

    @Override
    public void buy(String itemName, int count) {
        FarmerBuyAction.getInstance().setItemName(itemName).setCount(count);
    }

    @Override
    public void sell(String itemName) {
        FarmerSellAction.getInstance().setItemName(itemName).doAction();
    }

    @Override
    public void sell(String itemName, int count) {
        for(int i = 0 ; i < count; i++){
            sell(itemName);
        }
    }

    @Override
    public void process(FarmObj farmObj) {
        FarmerProcessAction.getInstance().setFarmObj(farmObj).doAction();
    }

    @Override
    public void useLandAdapter(FarmLand farmLand, LandAdaptor landAdapter) {
        FarmerUseLandAdaptorAction.getInstance().setLandAdaptor(landAdapter).setFarmLand(farmLand).doAction();

    }

    @Override
    public Employee getEmployee(int id) {
        return EmployeeFactory.getInstance().getEmpolyee(id);
    }
}
