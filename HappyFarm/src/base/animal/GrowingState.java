package base.animal;

import java.util.Random;

public class GrowingState implements AnimalState{

    private Animal animal;
    public GrowingState(Animal animal){
        this.animal=animal;
    }
    @Override
    public void grow() {
        Random ra=new Random();
        int num=ra.nextInt(100)+1;
        //百分之70的概率成长为成熟期
        if(num<=20) {
            animal.setState(animal.growingState);
        }
        else if(num>20&&num<90){
            animal.setState(animal.matureState);
            animal.isMature=true;
        }
        else{
            animal.setState(animal.deadState);
            animal.shouldRemove=true;
        }
    }

    @Override
    public void eat() {
        Random ra=new Random();
        int num=ra.nextInt(100)+1;
        if(num>70){
            animal.setState(animal.matureState);
            animal.isMature=true;
        }
    }

    @Override
    public void process() {

    }
}