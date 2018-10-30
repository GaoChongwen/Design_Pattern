package test.templateMethod;

import action.person.employee.EmployeeCultivateAction;
import action.person.employee.EmployeeHarvestAction;
import action.person.employee.EmployeeSlaughterAction;
import action.person.employee.EmployeeSowSeedAction;
import action.person.farmer.FarmerBuyAction;
import action.person.farmer.FarmerProcessAction;
import action.person.farmer.FarmerSellAction;
import animal.Chicken;
import base.Action;
import base.animal.Animal;
import building.farmland.CornField;
import building.shed.ChickShed;
import person.Employee;
import person.Farmer;
import plant.Wheat;
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
                "\n     to harvest a corn filed " +
                "\n     planted with wheat." +
                "\n====================================================================");
        employeeSowSeedAction.doAction();
//        employeeHarvestAction.doAction();

        /* 喂养动物demo */

        /* 屠宰动物demo */
        // 1. 指定一个屠宰Action
        EmployeeSlaughterAction slaughterAction = EmployeeSlaughterAction.getInstance();
        // 指定debug Template Method模式
        slaughterAction.setTemplateMethodMode(true);
        // 2. 指定一个雇员
        slaughterAction.setTarget(testEmp);
        // 3. 指定一个AnimalHouse
        slaughterAction.setAnimalHouse(chickShed);
        // 5. 执行屠宰操作
        System.out.println("" +
                "\n====================================================================" +
                "\n Scenario 3:" +
                "\n     Assign an employee with cultivation skill " +
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
                "\n Scenario 4:" +
                "\n     The farmer tries to buy 5 wheat seeds "+
                "\n====================================================================");
        buyAction.doAction();

        /* 卖东西demo */
        // 1. 指定卖东西操作
        FarmerSellAction sellAction = FarmerSellAction.getInstance();
            // 指定debug Template Method模式
        buyAction.setTemplateMethodMode(true);
        // 2. 指定出售种类
        sellAction.setItemName("wheat");
        // 3. 执行出售操作
        sellAction.doAction();

        /* 加工demo */
        // 1. 指定加工操作
        FarmerProcessAction processAction = FarmerProcessAction.getInstance();
        // 2. 指定加工对象
        // todo...

//        chickShed.feed();chickShed.feed();chickShed.feed();chickShed.feed();
        chickShed.slaughter();
    }
}
