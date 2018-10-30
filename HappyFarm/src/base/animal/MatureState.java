package base.animal;

import java.util.Random;

public class MatureState implements AnimalState{
    private Animal animal;
    public MatureState(Animal animal){
        this.animal=animal;
    }

    @Override
    public void grow() {
        Random ra=new Random();
        int num=ra.nextInt(100)+1;
        if(num<5){ //百分之5概率死亡
            System.out.println(animal.getName()+"病死了");
            animal.setState(animal.deadState);
            animal.shouldRemove=true;
            animal.isMature=false;
        }
    }

    @Override
    public void eat() {

    }

    @Override
    public void process() {
        animal.setState(animal.deadState);
        animal.shouldRemove=true;
        animal.isMature=false;
    }
}
