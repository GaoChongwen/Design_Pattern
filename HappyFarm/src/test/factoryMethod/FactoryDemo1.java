package test.factoryMethod;

import base.animal.Animal;
import base.plant.Plant;
import factory.AbstractFactory;
import factory.AnimalFactory;
import factory.PlantFactory;

import java.util.Random;

public class FactoryDemo1 {
    public static void main(String args[]){
        AbstractFactory animalFactory=new AnimalFactory();
        AbstractFactory plantFactory=new PlantFactory();
        Animal[] animals=new Animal[10];
        Plant[] plants=new Plant[10];

        for(int i=0; i<10; ++i){
            Random ra = new Random();
            int num = ra.nextInt(3) + 1;
            if(num==1){
                animals[i]=animalFactory.createAnimal("chicken");
            }
            else if(num==2){
                animals[i]=animalFactory.createAnimal("cow");
            }
            else{
                animals[i]=animalFactory.createAnimal("pig");
            }
        }
    }
}
