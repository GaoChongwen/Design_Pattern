package test.templateMethod;

import action.person.employee.EmployeeFeedAction;
import action.person.employee.EmployeeHarvestAction;
import action.person.employee.EmployeeSlaughterAction;
import action.person.employee.EmployeeSowSeedAction;
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
 * Scenario:
 */
public class TemplateMethod {
    public static void main(String args[]){
        /* 此部分代码与本模式无关 */
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
        Farm.getInstance().initialFarmObj();
        AppleAdaptor appleAdaptor = (AppleAdaptor) AdaptorFactory.getInstance().createAdaptor("appleField");


        /* 播种操作demo */
        // 1. 指定一个播种Action
        EmployeeSowSeedAction employeeSowSeedAction = EmployeeSowSeedAction.getInstance();
            // 指定debug Template Method模式
        employeeSowSeedAction.setTemplateMethodMode(true);
        // 2. 指定一个雇员
        employeeSowSeedAction.setTarget(testEmp);
        // 3. 指定一块土地
        employeeSowSeedAction.setFarmLand(cornField);
        // 4. 指定一个种子
        employeeSowSeedAction.setSeed(wheat);

        // 5. 执行播种操作
        System.out.println("" +
                "\n====================================================================" +
                "\n Scenario 1:" +
                "\n     Assign an employee with cultivation skill " +
                "\n     to plant a seed of wheat " +
                "\n     in a corn filed." +
                "\n====================================================================");
        employeeSowSeedAction.doAction();


        wheat.grow();
        wheat.grow();

        /* 收割操作demo */
        // 1. 指定一个收割Action
        EmployeeHarvestAction employeeHarvestAction = EmployeeHarvestAction.getInstance();
            // 指定debug Template Method模式
        employeeHarvestAction.setTemplateMethodMode(true);
        // 2. 指定一个雇员
        employeeHarvestAction.setTarget(testEmp);
        // 3. 指定一块土地
        employeeHarvestAction.setFarmLand(cornField);
        // 4. 指定一个收获工具
        employeeHarvestAction.setHarvestTool(sickle);
        // 5. 执行收割操作
        System.out.println("" +
                "\n====================================================================" +
                "\n Scenario 2:" +
                "\n     Assign an employee with cultivation skill " +
                "\n     to harvest a corn filed planted with wheat." +
                "\n====================================================================");
        employeeSowSeedAction.doAction();
//        employeeHarvestAction.doAction();

        /* 喂养动物demo */
        EmployeeFeedAction feedAction = EmployeeFeedAction.getInstance();
        feedAction.setTemplateMethodMode(true);
        feedAction.setAnimalHouse(chickShed);
        System.out.println("" +
                "\n====================================================================" +
                "\n Scenario 3:" +
                "\n     The farmer tries to feed animals in chicken shed." +
                "\n====================================================================");
        feedAction.doAction();


        /* 屠宰动物demo */
        // 1. 指定一个屠宰Action
        EmployeeSlaughterAction slaughterAction = EmployeeSlaughterAction.getInstance();
        // 指定debug Template Method模式
        slaughterAction.setTemplateMethodMode(true);
        // 2. 指定一个雇员
        slaughterAction.setTarget(breadEmp);
        // 3. 指定一个AnimalHouse
        slaughterAction.setAnimalHouse(chickShed);
        // 5. 执行屠宰操作
        System.out.println("" +
                "\n====================================================================" +
                "\n Scenario 4:" +
                "\n     Assign an employee with breeding skill " +
                "\n     to slaughter a chicken shed. "+
                "\n====================================================================");
        slaughterAction.doAction();


        /* 买东西demo */
        // 1. 指定买东西Action
        FarmerBuyAction buyAction = FarmerBuyAction.getInstance();
            // 指定debug Template Method模式
        buyAction.setTemplateMethodMode(true);
        // 2. 指定购买种类
        buyAction.setItemName("wheat");
        // 3. 执指定购买数量
        buyAction.setCount(5);
        // 3. 执行购买操作
        System.out.println("" +
                "\n====================================================================" +
                "\n Scenario 5:" +
                "\n     The farmer tries to buy 5 wheat seeds "+
                "\n====================================================================");
        buyAction.doAction();

        /* 卖东西demo */
        // 1. 指定卖东西操作
        FarmerSellAction sellAction = FarmerSellAction.getInstance();
            // 指定debug Template Method模式
        sellAction.setTemplateMethodMode(true);
        // 2. 指定出售种类
        sellAction.setItemName("wheat");
        // 3. 执行出售操作
        System.out.println("" +
                "\n====================================================================" +
                "\n Scenario 6:" +
                "\n     The farmer tries to sell a wheat seeds "+
                "\n====================================================================");
        sellAction.doAction();

        /* 加工demo */
        // 1. 指定加工操作
        FarmerProcessAction processAction = FarmerProcessAction.getInstance();
        processAction.setTemplateMethodMode(true);
        // 2. 指定加工对象
        processAction.setFarmObj(wheat);
        System.out.println("" +
                "\n====================================================================" +
                "\n Scenario 7:" +
                "\n     The farmer tries to process a harvested wheat "+
                "\n====================================================================");
        processAction.doAction();

        /* 使用Adaptor Demo */
        // 1. 指定操作
        FarmerUseLandAdaptorAction useLandAdaptorAction = FarmerUseLandAdaptorAction.getInstance();
            //  指定debug Template模式
        useLandAdaptorAction.setTemplateMethodMode(true);
        // 2. 指定farm land
        useLandAdaptorAction.setFarmLand(cornField);
        // 3. 指定Adaptor
        useLandAdaptorAction.setLandAdaptor(appleAdaptor);
        // 4. 执行操作
        System.out.println("" +
                "\n====================================================================" +
                "\n Scenario 8:" +
                "\n     The farmer tries to adapt a corn field into an apple field " +
                "\n     using appleFieldAdaptor. "+
                "\n====================================================================");
        useLandAdaptorAction.doAction();
    }
}
