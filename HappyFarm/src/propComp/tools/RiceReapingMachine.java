package propComp.tools;

/**
 * Class <code>RiceReapingMachine</code> is for Bridge Pattern:
 *      Implements the HarvestAPI to harvest rice with reaping Machine
 */
public class RiceReapingMachine implements HarvestAPI{
    @Override
    public void harvestWithMachine() {
        System.out.println("RiceReapingMachine: harvestWithMachine(): harvesting rice with reaping machine.");
    }
}
