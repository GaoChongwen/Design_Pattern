package processSystem;

import base.FarmObj;
import base.Produce;
import base.animal.Animal;
import factory.ProduceFactory;
import utils.Enum.ProduceType;

public class CowProcessor implements ProcessAPI {
    protected boolean designPattern = false;

    public Produce process(FarmObj obj){
        Animal animal = (Animal) obj;
        if(animal.process()){
            milking(animal);
            disinfector(animal);
            pack(animal);
            return createAnimalFood();
        }
        return null;
    }

    protected void milking(Animal animal){
        if(designPattern){
            System.out.println("Facade Pattern | AnimalProcessor milking the "+animal.getName());
            return;
        }
        System.out.println("AnimalProcessor milking the "+animal.getName()+" ...");
    }
    protected void disinfector(Animal animal){
        if(designPattern){
            System.out.println("Facade Pattern | AnimalProcessor disinfector the "+animal.getName());
            return;
        }
        System.out.println("AnimalProcessor disinfector the "+animal.getName()+" ...");

    }
    protected void pack(Animal animal){
        if(designPattern){
            System.out.println("Facade Pattern | AnimalProcessor pack the "+animal.getName());
            return;
        }
    }
    protected Produce createAnimalFood(){
        return ProduceFactory.getInstance().createProduce(ProduceType.milk.toString());
    }

    public void setDesignPattern(boolean designPattern){
        this.designPattern=designPattern;
    }
}
