package process;

import animal.Cow;
import base.animal.Animal;
import base.plant.Plant;

public class ProcessMaker {
    private ProcessAPI cowProcessor;
    private ProcessAPI meatProcessor;
    private ProcessAPI plantProcessor;

    public ProcessMaker() {
        cowProcessor = new CowProcessor();
        meatProcessor = new MeatProcessor();
        plantProcessor = new PlantProcessor();
    }

    public void processCow(Cow cow) {
        if (cow.getName().length() > 2 && cow.getName().substring(0, 3) == "cow") {
            cowProcessor.process(cow);
        }
    }

    public void processMeat(Animal animal) {
        if(animal.getName().length() > 2 && !(animal.getName().substring(0, 3) == "cow")){
            meatProcessor.process(animal);
        }

    }

    public void processPlant(Plant plant) {
        if(plant.getType()=="Plant"){
            plantProcessor.process(plant);
        }
    }
}
