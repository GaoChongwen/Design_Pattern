package person;

import action.person.employee.EmployeeHarvestAction;
import action.person.employee.EmployeeSlaughterAction;
import action.person.employee.EmployeeSowSeedAction;
import base.Person;
import base.animal.Animal;
import base.plant.Plant;
import building.farmland.FarmLand;
import building.shed.AnimalHouse;
import propComp.PropDir.Prop;
import propComp.tools.ReapingMachine;
import propComp.tools.Tool;
import singleton.Farm;
import utils.Enum.EmployeeSkill;
import singleton.MessageBoard;

import java.util.ArrayList;
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

    public EmployeeSkill getSkill() {
        return skill;
    }

    public float getSalary(){
        return salary;
    }

    public int getId() { return this.id; }


    @Override
    public boolean harvest(FarmLand farmLand, String toolName) {
        Tool tool = null;
        //Tool tool = Farm.getInstance().getToolByName(toolName);

        return EmployeeHarvestAction.getInstance().setFarmLand(farmLand).setHarvestTool(tool).setTarget(this).doAction();
    }


    @Override
    public ArrayList<Animal> slaughter(AnimalHouse animalHouse) {
        EmployeeSlaughterAction slaughterAction = EmployeeSlaughterAction.getInstance();
        slaughterAction.setAnimalHouse(animalHouse).setTarget(this).doAction();
        return slaughterAction.getDeadAnimals();
    }

    @Override
    public boolean sowSeed(FarmLand farmLand, Plant plant) {
        return EmployeeSowSeedAction.getInstance().setFarmLand(farmLand).setSeed(plant).setTarget(this).doAction();
    }
}
