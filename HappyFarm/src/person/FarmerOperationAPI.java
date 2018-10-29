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
    public void buy(String itemName);

    /** buy n items from the store. */
    public void buy(String itemName, int count);

    /** sell an item. */
    public void sell(String itemName);

    /** sell n items. */
    public void sell(String itemName, int count);

    /** process an item. */
    public void process(FarmObj farmObj);

    /** process all items. */
    public void process();

    /** use land-adapter. */
    public void useLandAdapter(FarmLand farmLand, LandAdaptor landAdapter);
}
