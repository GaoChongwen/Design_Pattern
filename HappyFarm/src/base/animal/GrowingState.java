package base.animal;

import java.util.Random;

public class GrowingState implements AnimalState{

    private Animal animal;
    public GrowingState(Animal animal){
        this.animal=animal;
    }

    @Override
    public String getStateNanem() {
        return "growingState";
    }

    @Override
    public void grow() {
        Random ra=new Random();
        int num=ra.nextInt(100)+1;
        //百分之70的概率成长为成熟期
        if(num<=20) {
            System.out.println(animal.getName()+" dosen't grow and it's still in growingState");
            animal.setState(animal.growingState);
        }
        else if(num>20&&num<90){
            System.out.println(animal.getName()+" grows from growing state to matureState");
            animal.setState(animal.matureState);
            animal.isMature=true;
        }
        else{
            System.out.println(animal.getName()+" has been dead");
            animal.setState(animal.deadState);
            animal.shouldRemove=true;
        }
    }

    @Override
    public void eat() {
        System.out.println(animal.getName()+"start to eat food");
        Random ra=new Random();
        int num=ra.nextInt(100)+1;
        if(num>70){
            System.out.println(animal.getName()+"grows from growingState to matureState");
            animal.setState(animal.matureState);
            animal.isMature=true;
        }
    }

    @Override
    public boolean process() {
        return false;
    }
}