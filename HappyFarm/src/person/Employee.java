package person;

import base.Person;
import utils.Enum.EmployeeSkill;
import singleton.MessageBoard;

import java.util.Observable;

/**
 * @autho Chudi LAN
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

    public void getInfo(){
        System.out.println("name: "+getName()+"   skill: "+getSkill().toString()+" salary: "+getSalary());
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(this.name+": I can see " + ((MessageBoard)o).getMessageNum() + " messages.");
    }

    public boolean hasSkill(EmployeeSkill skill){
        return (this.skill == skill);
    }

    public EmployeeSkill getSkill() { return skill; }

    public float getSalary(){
        return salary;
    }

}
