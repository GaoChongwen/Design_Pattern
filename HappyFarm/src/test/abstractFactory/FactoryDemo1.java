package test.abstractFactory;

import base.animal.Animal;
import base.plant.Plant;
import factory.AbstractFactory;
import factory.AnimalFactory;
import factory.PlantFactory;
import factory.ToolFactory;
import propComp.tools.Tool;

import java.util.Random;
/**
 * @project: HappyFarm
 * @scene: 抽象工程设计模式，底下有一系列具体工厂族，可以成产特定的抽象产品
 * @designPattern: AbstractorFactory
 * @author: Tingjie Wen
 * @date: 2018-10-27
 **/
public class FactoryDemo1 {
    public static void main(String args[]){
        //animalFactory和toolFactory是两个具体工厂
        AbstractFactory animalFactory=new AnimalFactory();
        AbstractFactory toolFactory=new ToolFactory();
        Animal[] animals=new Animal[10];
        Tool[] tools=new Tool[10];

        //根据String name具体生成抽象产品的哪个具体类
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

        //根据String name具体生成抽象产品的哪个具体类
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
