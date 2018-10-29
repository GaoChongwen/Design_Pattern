package person;
import base.FarmObj;
import base.Person;
import building.farmland.FarmLand;
import propComp.props.landAdaptor.LandAdaptor;

/**
 * @author Chudi LAN
 * Design-Pattern：Singleton, Double checked locking
 */
public class Farmer extends Person implements FarmerOperationAPI{
    private volatile static Farmer ourInstance = new Farmer();
    public static Farmer getInstance() { return ourInstance; }
    private Farmer(){ this.name = "Farmer"; }

    @Override
    public void changeName(String name) {
        setName(name);
        System.out.println("The farmer has changed name to "+getName());
    }

    @Override
    public void buy(String itemName) {

    }

    @Override
    public void buy(String itemName, int count) {

    }

    @Override
    public void sell(String itemName) {

    }

    @Override
    public void sell(String itemName, int count) {

    }

    @Override
    public void process(FarmObj farmObj) {

    }

    @Override
    public void process() {

    }

    @Override
    public void useLandAdapter(FarmLand farmLand, LandAdaptor landAdapter) {

    }
}
