package piewerTest.abstractFactory;

import base.animal.Animal;
import base.plant.Plant;
import factory.AbstractFactory;
import factory.AnimalFactory;
import factory.PlantFactory;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class Test {
    public static void main(String args[]){
        AbstractFactory animalFactory=new AnimalFactory();
        AbstractFactory plantFactory= PlantFactory.getInstance();

        Animal[] animals=new Animal[10];
        Plant[] plants=new Plant[10];

        for(int i=0; i<10; ++i){
            Random ra = new Random();
            int num = ra.nextInt(3) + 1;
            if(num==1){
                animals[i]=animalFactory.createAnimal("chicken");
                System.out.println("a chicken has been created by animalFactory");
            }
            else if(num==2){
                animals[i]=animalFactory.createAnimal("cow");
                System.out.println("a cow has been created by animalFactory");
            }
            else if(num==3){
                animals[i]=animalFactory.createAnimal("pig");
                System.out.println("a pig has been created by animalFactory");
            }
            else{
                System.out.println("System error");
            }
        }

        for(int i=0; i<10; ++i){
            Random ra = new Random();
            int num = ra.nextInt(4) + 1;
            if(num==1){
                plants[i]=plantFactory.createPlant("apple");
                System.out.println("an apple has been created by plantFactory");
            }
            else if(num==2){
                plants[i]=plantFactory.createPlant("cabbage");
                System.out.println("an cabbage has been created by plantFactory");
            }
            else if(num==3){
                plants[i]=plantFactory.createPlant("rice");
                System.out.println("an rice has been created by plantFactory");
            }
            else if(num==4){
                plants[i]=plantFactory.createPlant("rice");
                System.out.println("an wheat has been created by plantFactory");
            }
            else {
                System.out.println("System Error");
            }
        }

    }
}
