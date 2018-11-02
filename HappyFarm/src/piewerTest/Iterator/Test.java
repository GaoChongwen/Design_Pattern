package piewerTest.Iterator;

import animal.Chicken;
import animal.Cow;
import base.Iterator;
import base.animal.Animal;
import building.shed.ChickShed;
import building.shed.CowShed;

public class Test {
    public static void main(String args[]){

        System.out.println("==========IteratorTest========");
        System.out.println("=====================================\n");

        //分别却chickShed和CowShed的iterator
        Iterator[] iterators=new Iterator[2];
        iterators[0]= ChickShed.getInstance().getIterator();
        iterators[1]= CowShed.getInstance().getIterator();


        for(int i=0; i<20; ++i){
            ChickShed.getInstance().addAnimal(new Chicken());
        }
        for(int i=0; i<20; ++i){
            CowShed.getInstance().addAnimal(new Cow());
        }

        //利用iterator分别遍历cowshed和chickShed而不必关心它们的具体容器细节
        for(int i=0; i<iterators.length; ++i){
            while(iterators[i].hasNext()){
                Animal tem=(Animal) iterators[i].next();
                if(tem!=null){
                    System.out.println(tem.getName()+" has been covered by iterator");
                }
            }
        }

        System.out.println("=====\n");
        System.out.println("Test Done.");
    }
}
