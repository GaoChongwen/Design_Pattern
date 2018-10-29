package person;

import base.Person;
import utils.Enum.EmployeeSkill;
import singleton.MessageBoard;

import java.util.Observable;

/**
 * @author Chudi LAN
 * Design-Pattern: Observer
 */
public class Employee extends Person {
    private float salary;
    private EmployeeSkill skill;
    private static int count;
    private int id;

    public Employee(String name, EmployeeSkill skill, float salary){
        super();
        this.name = name;
        this.skill = skill;
        this.salary = salary;
        count = 0;
        id = count++;
    }

    public void getInfo(){
        System.out.println("id: "+getId()+" name: "+getName()+"   skill: "+getSkill().toString()+" salary: "+getSalary());
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

    public int getId() { return this.id; }

}
