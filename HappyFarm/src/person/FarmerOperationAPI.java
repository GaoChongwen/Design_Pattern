package person;

import base.FarmObj;
import building.farmland.FarmLand;
import propComp.props.landAdaptor.LandAdaptor;

/***
 * @author Chudi LAN
 * @version 2018-10-29
 *
 * operations for the farmer.
 *
 */
public interface FarmerOperationAPI {
    /** change farmer's name. */
    public void changeName(String name);

    /** buy an item from the store. */
    public boolean buy(String itemName);

    /** buy n items from the store. */
    public boolean buy(String itemName, int count);

    /** sell an item. */
    public boolean sell(String itemName);

    /** sell n items. */
    public boolean sell(String itemName, int count);

    /** process an item. */
    public boolean process(FarmObj farmObj);

    /** use land-adapter. */
    public boolean useLandAdapter(FarmLand farmLand, LandAdaptor landAdapter);

    public Employee getEmployee(int id);
}
