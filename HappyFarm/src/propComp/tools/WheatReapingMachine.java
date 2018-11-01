package propComp.tools;

/**
 * Class<code>WheatReapingMachine</code>For Bridge Pattern:
 *      Implements HarvestAPI to extend the harvest with harvest wheat
 *
 * @author Chudi LAN
 * @version 2018-11-1
 */
public class WheatReapingMachine implements HarvestAPI{
    @Override
    public void harvestWithMachine() {
        System.out.println("WheatReapingMachine: harvestWithMachine(): harvesting wheat with reaping machine.");
    }
}
