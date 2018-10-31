package processSystem;

import base.FarmObj;
import base.Produce;
import base.animal.Animal;
import factory.ProduceFactory;
import utils.Enum.ProduceType;

public class MeatProcessor implements ProcessAPI {
    protected boolean designPattern = false;

    public Produce process(FarmObj obj){
        Animal animal = (Animal) obj;
        if(animal.process()){
            slaughter(animal);
            cook(animal);
            pack(animal);
            return createAnimalFood();
        }
        return null;
    }

    protected void slaughter(Animal animal){
        if(designPattern){
            System.out.println("Facade Pattern | AnimalProcessor slaughter the "+animal.getName());
            return;
        }
        System.out.println("AnimalProcessor slaughter the "+animal.getName()+" ...");
    }
    protected void cook(Animal animal){
        if(designPattern){
            System.out.println("Facade Pattern | AnimalProcessor cook the "+animal.getName());
            return;
        }
        System.out.println("AnimalProcessor cook the "+animal.getName()+" ...");

    }
    protected void pack(Animal animal){
        if(designPattern){
            System.out.println("Facade Pattern | AnimalProcessor pack the "+animal.getName());
            return;
        }
        System.out.println("AnimalProcessor pack the "+animal.getName()+" ...");
    }
    protected Produce createAnimalFood(){
        return ProduceFactory.getInstance().createProduce(ProduceType.cookedFood.toString());
    }

    public void setDesignPattern(boolean designPattern){
        this.designPattern=designPattern;
    }
}
