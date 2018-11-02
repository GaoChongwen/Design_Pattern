package piewerTest.Strategy;

import action.StrategyContext;
import action.person.employee.EmployeeSowSeedAction;
import action.person.farmer.FarmerBuyAction;
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

public class Test {
    public static void main(String args[]){
        Employee testEmp = new Employee("Mary", EmployeeSkill.cultivation, 5000);
        Employee breadEmp = new Employee("Breeder",EmployeeSkill.breeding, 5000);
        Farmer farmer = Farmer.getInstance();
        Tool sickle = new Sickle();
        CornField cornField = new CornField();
        Wheat wheat = new Wheat();
        Store store =Store.getInstance();
        Animal chicken1=new Chicken();Animal chicken2 = new Chicken();Animal chicken3 = new Chicken();
        ChickShed chickShed = ChickShed.getInstance();chickShed.addAnimal(chicken1);chickShed.addAnimal(chicken2);chickShed.addAnimal(chicken3);
        AppleAdaptor appleAdaptor = (AppleAdaptor) AdaptorFactory.getInstance().createAdaptor("appleField");

        Action sowSeed = EmployeeSowSeedAction.getInstance().setFarmLand(cornField).setSeed(wheat).setTarget(testEmp);
        Action buy = FarmerBuyAction.getInstance().setItemName("Plant").setCount(1);
        Action.setDesignPatternMode(DesignPatternMode.StrategyPattern);

        System.out.println("Strategy test 1:");
        StrategyContext context = new StrategyContext(sowSeed);
        context.executeStrategy();
        System.out.println();

        System.out.println("Strategy test 2:");
        context = new StrategyContext(buy);
        context.executeStrategy();

    }
}
