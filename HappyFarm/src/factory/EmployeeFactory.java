package factory;

import person.Employee;
import utils.Enum.EmployeeSkill;

import java.util.ArrayList;

/**
 * @author Chudi LAN
 * @version 2018-10-29
 * Design-Pattern: Factory Method, Singleton
 */
public class EmployeeFactory extends AbstractFactory{
    private volatile static EmployeeFactory instance = new EmployeeFactory();
    private EmployeeFactory(){
        employees = new ArrayList<>();
    }
    public static EmployeeFactory getInstance() { return instance;}

    private ArrayList<Employee> employees;

    @Override
    public Employee createEmployee(String name, EmployeeSkill skill, float salary) {
        Employee employee = new Employee(name, skill, salary);
        employees.add(employee);
       return employee;
    }

    public int getAllEmployees(){
        System.out.println("--------------- Employees ---------------");
        for(Employee e : employees){
            System.out.println("name: "+e.getName()+"   skill: "+e.getSkill().toString()+" salary: "+e.getSalary());
        }
        System.out.println();
        return employees.size();
    }

    public Employee getEmpolyee(int id){
        if(id < 1 || id > employees.size()){
            System.out.println("Invalid id: out of range.");
            return null;
        }
        return employees.get(id-1);
    }

    public ArrayList<Employee> findEmployeesWithSkill(EmployeeSkill skill){
        ArrayList<Employee> results = new ArrayList<>();
        System.out.println();
        for(Employee e : employees){
            if(e.hasSkill(skill))
                results.add(e);
        }
        return results;
    }
}
