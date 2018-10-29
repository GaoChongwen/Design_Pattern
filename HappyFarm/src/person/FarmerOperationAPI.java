package person;

import base.FarmObj;
import base.Item;
import building.farmland.FarmLand;

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
    public void buy(Item item);

    /** buy n items from the store. */
    public void buy(Item item, int count);

    /** sell an item. */
    public void sell(FarmObj farmObj);

    /** sell n items. */
    public void sell(FarmObj farmObj, int count);

    /** process an item. */
    public void process(FarmObj farmObj);

    /** process all items. */
    public void process();

    /** use land-adapter. */
    public void useLandAdapter(FarmLand farmLand, LandAdapter landAdapter);
}
