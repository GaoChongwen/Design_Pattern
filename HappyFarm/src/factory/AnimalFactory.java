package factory;

import animal.Chicken;
import animal.Cow;
import animal.Pig;
import base.animal.Animal;

public class AnimalFactory extends AbstractFactory {
    @Override
    Animal createAnimal(String name) {
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
