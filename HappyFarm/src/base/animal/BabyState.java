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
        //百分之50的概率成长为青年期,百分之30概率死亡
        if(num<=20) {
            System.out.println(animal.getName()+" dosen't grow it's still in babyState");
            animal.setState(animal.babyState);
        }
        else if(num>20&&num<70){
            System.out.println(animal.getName()+" grows from babyState to growingState");
            animal.setState(animal.growingState);
        }
        else{
            System.out.println(animal.getName()+" has been dead");
            animal.setState(animal.deadState);
            animal.shouldRemove=true;
        }
    }

    @Override
    public void eat() {
        System.out.println(animal.getName()+" start to eat food");
        Random ra=new Random();
        int num=ra.nextInt(100)+1;
        if(num>50){  //百分之50概率成长为青年期
            System.out.println(animal.getName()+" grow from baby state to growing state");
            animal.setState(animal.growingState);
        }
    }

    @Override
    public boolean process() {
        return false;
    }
}