package test.abstractFactory;

import base.animal.Animal;
import base.plant.Plant;
import factory.AbstractFactory;
import factory.AnimalFactory;
import factory.PlantFactory;
import factory.ToolFactory;
import propComp.tools.Tool;

import java.util.Random;

public class FactoryDemo1 {
    public static void main(String args[]){
        AbstractFactory animalFactory=new AnimalFactory();
        AbstractFactory toolFactory=new ToolFactory();
        Animal[] animals=new Animal[10];
        Tool[] tools=new Tool[10];

        for(int i=0; i<10; ++i){
            Random ra = new Random();
            int num = ra.nextInt(3) + 1;
            if(num==1){
                animals[i]=animalFactory.createAnimal("chicken");
                System.out.println("a chicken has been created");
            }
            else if(num==2){
                animals[i]=animalFactory.createAnimal("cow");
                System.out.println("a cow has been created");
            }
            else{
                animals[i]=animalFactory.createAnimal("pig");
                System.out.println("a pig has been created");
            }
        }

        for(int i=0; i<10; ++i){
            Random ra = new Random();
            int num = ra.nextInt(2) + 1;
            if(num==1){
                tools[i]=toolFactory.createTool("reapingMachine");
                System.out.println("a reapingMachine has been created");
            }
            else{
                tools[i]=toolFactory.createTool("sickle");
                System.out.println("a sickle has been created");
            }
        }
    }
}
