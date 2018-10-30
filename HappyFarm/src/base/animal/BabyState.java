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
            System.out.println(animal.getName()+"没有成长");
            animal.setState(animal.babyState);
        }
        else if(num>20&&num<70){
            System.out.println(animal.getName()+"从幼崽成长为了青年期");
            animal.setState(animal.growingState);
        }
        else{
            System.out.println(animal.getName()+"病死了");
            animal.setState(animal.deadState);
            animal.shouldRemove=true;
        }
    }

    @Override
    public void eat() {
        Random ra=new Random();
        int num=ra.nextInt(100)+1;
        if(num>50){  //百分之50概率成长为青年期
            System.out.println(animal.getName()+"成长为了青年期");
            animal.setState(animal.growingState);
        }
    }

    @Override
    public boolean process() {
        return false;
    }
}