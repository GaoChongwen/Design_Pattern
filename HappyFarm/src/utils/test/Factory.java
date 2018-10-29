package utils.test;

import factory.EmployeeFactory;
import factory.PlantFactory;
import person.Employee;
import plant.Apple;
import plant.Wheat;
import utils.Context;
import utils.Enum.EmployeeSkill;
import utils.Enum.PlantType;

import java.util.ArrayList;

public class Factory {
    public static void main(String args[]){
        Wheat w = new Wheat(Context.wheat_stockPrice, Context.wheat_salePrice);
        Apple a = new Apple(Context.apple_stockPrice,Context.apple_salePrice);

        PlantFactory.getInstance().getAllPlant();
        Apple a1 = (Apple)PlantFactory.getInstance().createPlant("apple");
        System.out.println("key is"+ a1.getType());

        EmployeeFactory employeeFactory = EmployeeFactory.getInstance();
        Employee cyl = employeeFactory.createEmployee("cyl", EmployeeSkill.cultivation, 123);
        Employee ppp = employeeFactory.createEmployee("ppp", EmployeeSkill.breeding, 456);
        Employee www = employeeFactory.createEmployee("www", EmployeeSkill.cultivation, 789);
        employeeFactory.getAllEmployees();

        ArrayList emps = employeeFactory.findEmployeesWithSkill(EmployeeSkill.cultivation);

    }
}
