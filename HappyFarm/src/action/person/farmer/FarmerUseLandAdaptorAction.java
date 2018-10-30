package action.person.farmer;

import building.farmland.FarmLand;
import propComp.props.landAdaptor.LandAdaptor;

/**
 * @author Chudi LAN
 * @version 2018-10-31
 */
public class FarmerUseLandAdaptorAction extends FarmerAction{
    private FarmLand farmLand=null;
    private LandAdaptor landAdaptor = null;

    private volatile static FarmerUseLandAdaptorAction instance = new FarmerUseLandAdaptorAction();

    private FarmerUseLandAdaptorAction() {

    }

    public static FarmerUseLandAdaptorAction getInstance(){return instance;}

    @Override
    protected boolean checkCondition() {
        templateMethodOutput("step 1_1. checkCondition","checking faram land and land adaptor.");
        if (farmLand == null) {
            templateMethodOutput("step 1_1_1. checkCondition", "no farm land is specified.");
            return false;
        }
        if (landAdaptor == null) {
            templateMethodOutput("step 1_1_1. checkCondition", "no land adaptor is specified.");
            return false;
        }
        return true;
    }

    @Override
    protected void execute() {
        templateMethodOutput("step 1_2. execute","using an adaptor on a farmland.");
        farmLand.use(landAdaptor);
    }

    public void setFarmLand(FarmLand farmLand) {
        this.farmLand = farmLand;
    }

    public void setLandAdaptor(LandAdaptor landAdaptor) {
        this.landAdaptor = landAdaptor;
    }
}
