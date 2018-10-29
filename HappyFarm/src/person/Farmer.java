package person;
import action.person.FarmerBuyAction;
import base.FarmObj;
import base.Item;
import base.Person;
import building.farmland.FarmLand;

/**
 * @author Chudi LAN
 * Design-Pattern：Singleton, Double checked locking
 */
public class Farmer extends Person implements FarmerOperationAPI{
    private volatile static Farmer ourInstance = new Farmer();
    public static Farmer getInstance() { return ourInstance; }
    private Farmer(){ this.name = "Farmer"; }


}
