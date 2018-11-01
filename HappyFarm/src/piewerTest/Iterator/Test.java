package piewerTest.Iterator;

import animal.Chicken;
import animal.Cow;
import base.Iterator;
import base.animal.Animal;
import building.shed.ChickShed;
import building.shed.CowShed;

public class Test {
    public static void main(String args[]){
        Iterator[] iterators=new Iterator[2];
        iterators[0]= ChickShed.getInstance().getIterator();
        iterators[1]= CowShed.getInstance().getIterator();

        for(int i=0; i<20; ++i){
            ChickShed.getInstance().addAnimal(new Chicken());
        }
        for(int i=0; i<20; ++i){
            CowShed.getInstance().addAnimal(new Cow());
        }

        for(int i=0; i<iterators.length; ++i){
            while(iterators[i].hasNext()){
                Animal tem=(Animal) iterators[i].next();
                if(tem!=null){
                    System.out.println(tem.getName()+" has been covered by iterator");
                }
            }
        }
    }
}
