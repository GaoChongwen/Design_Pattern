package person;

import base.Person;
import utils.EmployeeSkill;

import java.util.Observable;


public class Employee extends Person {
    private float salary;
    private EmployeeSkill skills[];

    public Employee(String name, EmployeeSkill skills[], float salary){
        super();
        this.name = name;
        this.skills = skills;
        this.salary = salary;
    }

    @Override
    public void update(Observable o, Object arg) {
//        super.update(o, arg);
    }

    public Boolean hasSkill(EmployeeSkill skill){
        for(EmployeeSkill s : skills)
            if(s == skill)
                return true;
        return false;
    }

    public float getSalary(){
        return salary;
    }

}
