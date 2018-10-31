package processSystem;

import base.FarmObj;
import base.Produce;
import base.plant.Plant;
import factory.ProduceFactory;
import utils.Enum.ProduceType;

public class PlantProcessor implements ProcessAPI {
    protected boolean designPattern = false;

    public Produce process(FarmObj obj){
        Plant plant = (Plant)obj;
        if(plant.process()){
            clean(plant);
            mince(plant);
            stir(plant);
            return createAnimalFood();
        }
        return null;
    }

    protected void clean(Plant plant){
        if(designPattern){
            System.out.println("Facade Pattern | PlantProcessor clean the "+plant.getName());
            return;
        }
        System.out.println("PlantProcessor clean the "+plant.getName()+" ...");
    }
    protected void mince(Plant plant){
        if(designPattern){
            System.out.println("Facade Pattern | PlantProcessor mince the "+plant.getName());
            return;
        }
        System.out.println("PlantProcessor mince the "+plant.getName()+" ...");

    }
    protected void stir(Plant plant){
        if(designPattern){
            System.out.println("Facade Pattern | PlantProcessor stir the "+plant.getName());
            return;
        }
        System.out.println("PlantProcessor stir the "+plant.getName()+" ...");
    }
    protected Produce createAnimalFood(){
        return ProduceFactory.getInstance().createProduce(ProduceType.animalFood.toString());
    }

    public void setDesignPattern(boolean designPattern){
        this.designPattern=designPattern;
    }
}
