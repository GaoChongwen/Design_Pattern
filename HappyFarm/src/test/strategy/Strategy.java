package test.strategy;
import action.StrategyContext;
import action.person.employee.*;
import action.person.farmer.FarmerBuyAction;
import action.person.farmer.FarmerProcessAction;
import action.person.farmer.FarmerSellAction;
import action.person.farmer.FarmerUseLandAdaptorAction;
import animal.Chicken;
import base.Action;
import base.animal.Animal;
import building.farmland.CornField;
import building.shed.ChickShed;
import factory.AdaptorFactory;
import person.Employee;
import person.Farmer;
import plant.Wheat;
import propComp.props.landAdaptor.AppleAdaptor;
import propComp.tools.Sickle;
import propComp.tools.Tool;
import singleton.Farm;
import store.Store;
import utils.Enum.DesignPatternMode;
import utils.Enum.EmployeeSkill;

/**
 * @author Chudi LAN
 * @version 2018-10-28
 * Scenario: dynamically bind different operations to Cultivate and Breed
 */
public class Strategy {

    public static void main(String args[]) {
        /* 此部分代码与本模式无关 */
        Farm.getInstance().initialFarmObj();
        Employee testEmp = new Employee("Mary", EmployeeSkill.cultivation, 5000);
        Employee breadEmp = new Employee("Breeder",EmployeeSkill.breeding, 5000);
        Farmer farmer = Farmer.getInstance();
        Tool sickle = new Sickle();
        CornField cornField = new CornField();
        Wheat wheat = new Wheat();
        Store store =Store.getInstance();
        Animal chicken1=new Chicken();
        Animal chicken2 = new Chicken();
        Animal chicken3 = new Chicken();
        ChickShed chickShed = ChickShed.getInstance();
        chickShed.addAnimal(chicken1);
        chickShed.addAnimal(chicken2);
        chickShed.addAnimal(chicken3);
        AppleAdaptor appleAdaptor = (AppleAdaptor) AdaptorFactory.getInstance().createAdaptor("appleField");

        EmployeeSowSeedAction sowSeedAction = EmployeeSowSeedAction.getInstance().setSeed(wheat).setFarmLand(cornField);
        sowSeedAction.setTarget(testEmp);

        wheat.grow();wheat.grow();
        EmployeeHarvestAction harvestAction = EmployeeHarvestAction.getInstance().setHarvestTool(sickle).setFarmLand(cornField);
        harvestAction.setTarget(testEmp);

        EmployeeFeedAction feedAction = EmployeeFeedAction.getInstance().setAnimalHouse(chickShed);
        feedAction.setTarget(breadEmp);

        EmployeeSlaughterAction slaughterAction = EmployeeSlaughterAction.getInstance().setAnimalHouse(chickShed);
        slaughterAction.setTarget(breadEmp);

        FarmerProcessAction processAction = FarmerProcessAction.getInstance().setFarmObj(wheat);
        FarmerBuyAction buyAction = FarmerBuyAction.getInstance().setItemName("apple").setCount(3);
        FarmerSellAction sellAction = FarmerSellAction.getInstance().setItemName("apple");
        FarmerUseLandAdaptorAction useLandAdaptorAction = FarmerUseLandAdaptorAction.getInstance().setLandAdaptor(appleAdaptor).setFarmLand(cornField);



        System.out.println("\nTesting Strategy Pattern");
        Action.setDesignPatternMode(DesignPatternMode.StrategyPattern);


        System.out.println("" +
                "\n====================================================================\n" +
                "\n Scenario 1" +
                "\n     execute a strategy implemented by SowSeedAction: " +
                "\n         Assign an employee with cultivation skill" +
                "\n         to sow a wheat's seed into a corn field."+
                "\n     -------------------------------------------------------   ");
        StrategyContext context = new StrategyContext(sowSeedAction);
        context.executeStrategy();
        System.out.println("\n====================================================================\n");


        System.out.println("" +
                "\n====================================================================\n" +
                "\n Scenario 2" +
                "\n     execute a strategy implemented by HarvestAction:" +
                "\n         Assign an employee with cultivation skill" +
                "\n         to harvest a coin filed planted with wheat."+
                "\n     -------------------------------------------------------   ");
        context = new StrategyContext(harvestAction);
        context.executeStrategy();
        System.out.println("\n====================================================================\n");


        System.out.println("" +
                "\n====================================================================\n" +
                "\n Scenario 3" +
                "\n     execute a strategy implemented by FeedAction: " +
                "\n         Assign an employee with breeding skill" +
                "\n         to feed animals in the chicken shed."+
                "\n     -------------------------------------------------------   ");
        context = new StrategyContext(feedAction);
        context.executeStrategy();
        System.out.println("\n====================================================================\n");


        System.out.println("" +
                "\n====================================================================\n" +
                "\n Scenario 4" +
                "\n     execute a strategy implemented by SlaughterAction: " +
                "\n         Assign an employee with breeding skill to" +
                "\n         slaughter animals in the chicken shed."+
                "\n     -------------------------------------------------------   ");
        context = new StrategyContext(slaughterAction);
        context.executeStrategy();
        System.out.println("\n====================================================================\n");


        System.out.println("" +
                "\n====================================================================\n" +
                "\n Scenario 5" +
                "\n     execute a strategy implemented by ProcessAction: " +
                "\n         The farmer tries to process wheat harvested from the field."+
                "\n     -------------------------------------------------------   ");
        context = new StrategyContext(processAction);
        context.executeStrategy();
        System.out.println("\n====================================================================\n");


        System.out.println("" +
                "\n====================================================================\n" +
                "\n Scenario 6" +
                "\n     execute a strategy implemented by BuyAction: " +
                "\n         The farmer tries to buy 3 apples from the store."+
                "\n     -------------------------------------------------------   ");
        context = new StrategyContext(buyAction);
        context.executeStrategy();
        System.out.println("\n====================================================================\n");


        System.out.println("" +
                "\n====================================================================\n" +
                "\n Scenario 7" +
                "\n     execute a strategy implemented by SellAction: " +
                "\n         The farmer tries to sell 1 apple."+
                "\n     -------------------------------------------------------   ");
        context = new StrategyContext(sellAction);
        context.executeStrategy();
        System.out.println("\n====================================================================\n");


        System.out.println("" +
                "\n====================================================================\n" +
                "\n Scenario 8" +
                "\n     execute a strategy implemented by UseLandAdaptorAction: " +
                "\n         The farmer tries to convert a corn field into an apple field" +
                "\n         using field adaptor."+
                "\n     -------------------------------------------------------   ");
        context = new StrategyContext(useLandAdaptorAction);
        context.executeStrategy();
        System.out.println("\n====================================================================\n");

    }
}
