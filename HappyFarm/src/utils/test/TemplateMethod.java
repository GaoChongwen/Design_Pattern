package utils.test;

import action.person.employee.EmployeeCultivateAction;
import action.person.employee.EmployeeHarvestAction;
import base.Action;
import building.farmland.CornField;
import person.Employee;
import plant.Wheat;
import propComp.tools.Sickle;
import utils.Enum.EmployeeSkill;

/**
 * @author Chudi LAN
 * @version 2018-10-28
 * Scenario:
 */
public class TemplateMethod {
    public static void main(String args[]){
        Employee testEmp = new Employee("Test Template Method Employee", EmployeeSkill.cultivation, 5000);
        EmployeeHarvestAction employeeHarvestAction = EmployeeHarvestAction.getInstance();
        employeeHarvestAction.setTarget(testEmp);
        CornField cornField =new CornField();
        Wheat w = new Wheat();
        cornField.plant(w);
        w.grow();
        w.grow();
        employeeHarvestAction.setFarmLand(cornField);
        employeeHarvestAction.setHarvestTool(new Sickle());

        employeeHarvestAction.doAction();

    }
}
