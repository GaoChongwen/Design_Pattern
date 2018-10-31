package factory;

import animal.Chicken;
import animal.Cow;
import animal.Pig;
import base.animal.Animal;
import base.plant.Plant;

import java.util.Hashtable;

public class AnimalFactory extends AbstractFactory {
    private volatile static AnimalFactory singleton = new AnimalFactory();
    //单例模式
    public static AnimalFactory getInstance() {
        return singleton;
    }
    //根据名称生成具体的抽象产品
    @Override
    public Animal createAnimal(String name) {
        if(name.equals("cow")){
            return new Cow();
        }
        else if(name.equals("chicken")){
            return new Chicken();
        }
        else if(name.equals("pig")){
            return new Pig();
        }
        else{
            return null;
        }
    }
}
