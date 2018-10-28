package factory;

import animal.Chicken;
import animal.Cow;
import animal.Pig;
import base.animal.Animal;

public class AnimalFactory extends AbstractFactory {
    @Override
    Animal createAnimal(String name) {
        if(name=="cow"){
            return new Cow();
        }
        else if(name=="chicken"){
            return new Chicken();
        }
        else if(name=="pig"){
            return new Pig();
        }
        else{
            return null;
        }
    }
}
