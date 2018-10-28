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
        //百分之90的概率成长为成熟期
        if(num<=20) {
            animal.setState(animal.babyState);
            animal.setMature(true);
        }
        else{
            animal.setState(animal.babyState);
        }
    }
}