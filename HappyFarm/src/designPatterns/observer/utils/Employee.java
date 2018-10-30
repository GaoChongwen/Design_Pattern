package designPatterns.observer.utils;

import designPatterns.observer.messageBoard.Person;

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
        setName(name);
        this.skill = skill;
        this.salary = salary;
        count = 0;
        id = count++;
    }

    public void getInfo(){
        System.out.println("id: "+getId()+" name: "+getName()+"   skill: "+getSkill().toString()+" salary: "+getSalary());
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
