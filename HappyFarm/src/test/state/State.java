package test.state;

import base.animal.Animal;
import factory.AbstractFactory;
import factory.AnimalFactory;

import java.util.Random;
/**
 * @project: HappyFarm
 * @scene: animal有4种不同的状态，grow时animal会在四种不同的状态间切换
 * @designPattern: State
 * @author: Tingjie Wen
 * @date: 2018-10-31
 **/

public class State {
    public static void main(String args[]){
        Animal[] animals=new Animal[10];
        AbstractFactory animalFactory=new AnimalFactory();
        for(int i=0; i<10; ++i) {
            Random ra = new Random();
            int num = ra.nextInt(2) + 1;
            if(num==1){
                animals[i]=((AnimalFactory) animalFactory).createAnimal("chicken");
            }
            else if(num==2){
                animals[i]=((AnimalFactory) animalFactory).createAnimal("cow");
            }
            else if(num==3){
                animals[i]=((AnimalFactory) animalFactory).createAnimal("pig");
            }
            else{
                System.out.println("system error");
            }
        }

        for(int i=0; i<10; ++i){
            if(!animals[i].shouldRemove){
                animals[i].grow();
            }
        }
    }
}
