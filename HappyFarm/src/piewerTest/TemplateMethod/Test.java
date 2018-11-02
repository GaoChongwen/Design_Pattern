package piewerTest.TemplateMethod;

import action.person.employee.EmployeeHarvestAction;
import action.person.employee.EmployeeSowSeedAction;
import action.person.farmer.FarmerBuyAction;
import animal.Chicken;
import base.Action;
import base.animal.Animal;
import building.farmland.CornField;
import building.farmland.FarmLand;
import building.shed.ChickShed;
import factory.AdaptorFactory;
import person.Employee;
import person.Farmer;
import plant.Wheat;
import propComp.props.landAdaptor.AppleAdaptor;
import propComp.tools.ReapingMachine;
import propComp.tools.Sickle;
import propComp.tools.Tool;
import singleton.Farm;
import store.Store;
import utils.Enum.DesignPatternMode;
import utils.Enum.EmployeeSkill;

public class Test {
    public  static void main(String argsp[])
    {   Farm.getInstance().initialFarmObj();
        Employee cultivateEmp = new Employee("Cultivator", EmployeeSkill.cultivation, 5000);
        Employee breadEmp = new Employee("Breeder",EmployeeSkill.breeding, 5000);
        Farmer farmer = Farmer.getInstance();
        Tool sickle = new Sickle();
        CornField cornField = new CornField();
        Wheat wheat = new Wheat();
        Store store =Store.getInstance();
        Animal chicken1=new Chicken();Animal chicken2 = new Chicken();Animal chicken3 = new Chicken();ChickShed chickShed = ChickShed.getInstance();chickShed.addAnimal(chicken1);chickShed.addAnimal(chicken2);chickShed.addAnimal(chicken3);
        AppleAdaptor appleAdaptor = (AppleAdaptor) AdaptorFactory.getInstance().createAdaptor("appleField");

        Action sowSeed = EmployeeSowSeedAction.getInstance().setSeed(wheat).setFarmLand(cornField).setTarget(breadEmp);
        FarmerBuyAction buy = FarmerBuyAction.getInstance().setItemName("apple").setCount(2);
        Action.setDesignPatternMode(DesignPatternMode.TemplateMethodPattern);

        System.out.println("\nTemplate method test 1:");
        sowSeed.doAction();

        System.out.println("\nTemplate method test 2:");
        buy.doAction();

//        Store.getInstance().buyCommity("apple",1);
    }
}
