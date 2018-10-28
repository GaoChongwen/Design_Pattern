package person;

import base.Person;
import utils.EmployeeSkill;
import utils.MessageBoard;

import java.util.Observable;

/**
 * @author Chudi LAN
 * Design-Pattern: Observer
 */
public class Employee extends Person {
    private float salary;
    private EmployeeSkill skill;

    public Employee(String name, EmployeeSkill skill, float salary){
        super();
        this.name = name;
        this.skill = skill;
        this.salary = salary;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(getName()+": I can see" + ((MessageBoard)o).getMessageNum() + " messages.");
    }

    public boolean hasSkill(EmployeeSkill skill){
        return skill == this.skill;
    }

    public float getSalary(){
        return salary;
    }

}
