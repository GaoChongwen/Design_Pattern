package utils.test;

import action.person.employee.EmployeeCultivateAction;
import action.person.employee.EmployeeHarvestAction;
import action.person.employee.EmployeeSowSeedAction;
import base.Action;
import building.farmland.CornField;
import person.Employee;
import person.Farmer;
import plant.Wheat;
import propComp.tools.Sickle;
import propComp.tools.Tool;
import singleton.Farm;
import utils.Enum.EmployeeSkill;

/**
 * @author Chudi LAN
 * @version 2018-10-28
 * Scenario:
 */
public class TemplateMethod {
    public static void main(String args[]){
        /* 此部分代码与本模式无关 */
        Employee testEmp = new Employee("Test Template Method Employee", EmployeeSkill.cultivation, 5000);
        Farmer farmer = Farmer.getInstance();
        Tool sickle = new Sickle();
        CornField cornField = new CornField();
        Wheat wheat = new Wheat();


        /* 播种操作demo */
        // 1. 指定一个播种Action
        EmployeeSowSeedAction employeeSowSeedAction = EmployeeSowSeedAction.getInstance();
        // 2. 指定一个雇员
        employeeSowSeedAction.setTarget(testEmp);
        // 3. 指定一块土地
        employeeSowSeedAction.setFarmLand(cornField);
        // 4. 指定一个种子
        employeeSowSeedAction.setSeed(wheat);
        // 5. 执行播种操作
        employeeSowSeedAction.doAction();

        wheat.grow();
        wheat.grow();

        /* 收割操作demo */
        // 1. 指定一个收割Action
        EmployeeHarvestAction employeeHarvestAction = EmployeeHarvestAction.getInstance();
        // 2. 指定一个雇员
        employeeHarvestAction.setTarget(testEmp);
        // 3. 指定一块土地
        employeeHarvestAction.setFarmLand(cornField);
        // 4. 指定一个收获工具
        employeeHarvestAction.setHarvestTool(sickle);
        // 5. 执行收割操作
        employeeHarvestAction.doAction();


        /* 喂养动物demo */

        /* 屠宰动物demo */

        /* 买东西demo */

        /* 卖东西demo */

        /* 加工demo */
    }
}
