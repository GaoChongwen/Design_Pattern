package processSystem;

import animal.Cow;
import base.animal.Animal;
import base.plant.Plant;
import produce.AnimalFood;
import produce.CookedFood;
import produce.Milk;
import utils.Enum.DesignPatternMode;

import java.beans.DesignMode;

/**
 * Design-Pattern: SingleTon, Facade
 * @description: 加工者类，为Facade对外提供的接待者
 * @version 2018/10/31
 * @author lipeng liang
 *
 */
public class ProcessMaker {
    private volatile static ProcessMaker processMaker = new ProcessMaker();
    protected DesignPatternMode designPattern = null;


    public  static ProcessMaker getInstance(){return processMaker;}

    private ProcessAPI cowProcessor;
    private ProcessAPI meatProcessor;
    private ProcessAPI plantProcessor;

    public ProcessMaker() {
        cowProcessor = new CowProcessor();
        meatProcessor = new MeatProcessor();
        plantProcessor = new PlantProcessor();
    }

    public Milk processCow(Cow cow) {
        if (cow.getName().length() > 2 && cow.getName().substring(0, 3).equals("cow")) {
            if(designPattern==DesignPatternMode.FacadePattern){
                cowProcessor.setDesignPattern(true);
                System.out.println("Facade Pattern | ProcessMaker method: processCow(cow)");
            }
            return (Milk) cowProcessor.process(cow);
        }
        return null;
    }

    public CookedFood processMeat(Animal animal) {
        if(animal.getName().length() > 2 && !(animal.getName().substring(0, 3).equals("cow"))){

            if(designPattern==DesignPatternMode.FacadePattern){
                cowProcessor.setDesignPattern(true);
                System.out.println("Facade Pattern | ProcessMaker method: processMeat(animal)");
            }
            return (CookedFood) meatProcessor.process(animal);
        }
        return null;
    }

    public AnimalFood processPlant(Plant plant) {
        if(plant.getType().equals("Plant")){
            if(designPattern==DesignPatternMode.FacadePattern){
                cowProcessor.setDesignPattern(true);
                System.out.println("Facade Pattern | ProcessMaker method: processPlant(plant)");
            }
            return (AnimalFood) plantProcessor.process(plant);
        }
        return null;
    }
    // 设置设计模式
    public void setDesignPattern(DesignPatternMode designPatter){
        designPattern=designPatter;
    }
}
