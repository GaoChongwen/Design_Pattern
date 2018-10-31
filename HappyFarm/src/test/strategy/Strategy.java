package test.strategy;

import action.ActionStrategy;
import action.StrategyContext;
import action.person.employee.*;
import action.person.farmer.FarmerBuyAction;
import action.person.farmer.FarmerProcessAction;
import action.person.farmer.FarmerSellAction;
import action.person.farmer.FarmerUseLandAdaptorAction;
import animal.Chicken;
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
import utils.Enum.EmployeeSkill;

/**
 * @author Chudi LAN
 * @version 2018-10-28
 * Scenario: dynamically bind different operations to Cultivate and Breed
 */
public class Strategy {
    private ActionStrategy strategy;


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
        wheat.grow();wheat.grow();
        EmployeeHarvestAction harvestAction = EmployeeHarvestAction.getInstance().setHarvestTool(sickle).setFarmLand(cornField);
        EmployeeFeedAction feedAction = EmployeeFeedAction.getInstance().setAnimalHouse(chickShed);
        EmployeeSlaughterAction slaughterAction = EmployeeSlaughterAction.getInstance().setAnimalHouse(chickShed);
        FarmerProcessAction processAction = FarmerProcessAction.getInstance().setFarmObj(wheat);
        FarmerBuyAction buyAction = FarmerBuyAction.getInstance().setItemName("apple").setCount(3);
        FarmerSellAction sellAction = FarmerSellAction.getInstance().setItemName("apple");
        FarmerUseLandAdaptorAction useLandAdaptorAction = FarmerUseLandAdaptorAction.getInstance().setLandAdaptor(appleAdaptor).setFarmLand(cornField);



        System.out.println("Testing Strategy Pattern");

        StrategyContext context = new StrategyContext(sowSeedAction);
        context.executeStrategy();

        context = new StrategyContext(harvestAction);
        context.executeStrategy();

        context = new StrategyContext(feedAction);
        context.executeStrategy();

        context = new StrategyContext(slaughterAction);
        context.executeStrategy();

        context = new StrategyContext(processAction);
        context.executeStrategy();

        context = new StrategyContext(buyAction);
        context.executeStrategy();

        context = new StrategyContext(sellAction);
        context.executeStrategy();

        context = new StrategyContext(useLandAdaptorAction);
        context.executeStrategy();

    }
}
