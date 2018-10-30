package person;
import base.FarmObj;
import base.Person;
import building.farmland.FarmLand;
import propComp.props.landAdaptor.LandAdaptor;

/**
 * @author Chudi LAN
 * Design-Pattern：Singleton, Double checked locking
 */
public class Farmer extends Person{
    private volatile static Farmer ourInstance = new Farmer();
    public static Farmer getInstance() { return ourInstance; }
    private Farmer(){ setName("Farmer"); }

    public void changeName(String name) {
        setName(name);
        System.out.println("The farmer has changed name to "+getName());
    }

}
