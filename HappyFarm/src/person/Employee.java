package person;

import action.person.employee.EmployeeHarvestAction;
import action.person.employee.EmployeeSlaughterAction;
import action.person.employee.EmployeeSowSeedAction;
import base.Person;
import base.plant.Plant;
import building.farmland.FarmLand;
import building.shed.AnimalHouse;
import propComp.tools.Tool;
import utils.Enum.EmployeeSkill;
import singleton.MessageBoard;

import java.util.Observable;

/**
 * @author Chudi LAN
 * Design-Pattern: Observer
 */
public class Employee extends Person implements EmployeeOperationAPI{
    private float salary;
    private EmployeeSkill skill;
    private int id;
    private static int count = 1;
    public Employee(String name, EmployeeSkill skill, float salary){
        super();
        setName(name);
        setType("Employee");
        this.skill = skill;
        this.salary = salary;
        id = count++;
    }

    public void getInfo(){
        System.out.println("id: "+getId()+" name: "+getName()+"   skill: "+getSkill().toString()+" salary: "+getSalary());
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(getName()+": I can see " + ((MessageBoard)o).getMessageNum() + " messages.");
    }

    public boolean hasSkill(EmployeeSkill skill){
        return (this.skill == skill);
    }

    public EmployeeSkill getSkill() { return skill; }

    public float getSalary(){
        return salary;
    }

    public int getId() { return this.id; }

    @Override
    public void harvest() {
        // todo
    }

    @Override
    public void harvest(FarmLand farmLand, String toolName) {
        Tool tool = null;
        EmployeeHarvestAction.getInstance().setFarmLand(farmLand).setHarvestTool(tool).setTarget(this).doAction();
    }

    @Override
    public void slaughter() {
        // todo
    }

    @Override
    public void slaughter(AnimalHouse animalHouse) {
        EmployeeSlaughterAction.getInstance().setAnimalHouse(animalHouse).setTarget(this).doAction();
    }

    @Override
    public void sowSeeds(FarmLand farmLand, Plant plant) {
        EmployeeSowSeedAction.getInstance().setFarmLand(farmLand).setSeed(plant).setTarget(this).doAction();
    }
}
