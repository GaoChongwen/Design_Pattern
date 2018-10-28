package base.animal;

import java.util.Random;

public class BabyState implements AnimalState {
    private Animal animal;
    public BabyState(Animal animal){
        this.animal=animal;
    }

    @Override
    public void grow() {
        Random ra=new Random();
        int num=ra.nextInt(100)+1;
        //百分之80的概率成长为青年期
        if(num<=20) {
            animal.setState(animal.babyState);
        }
        else{
            animal.setState(animal.babyState);
        }
    }
}