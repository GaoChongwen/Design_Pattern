package test.Iterator;

import animal.Chicken;
import base.Iterator;
import base.animal.Animal;
import building.shed.ChickShed;

/**
 * @project: HappyFarm
 * @scene: 利用Iterator可以便利任何一种shed而不必在意具体shed的容器时数组或是链表
 * @designPattern: Iterator
 * @author: Tingjie Wen
 * @date: 2018-10-27
 **/

public class IteratorDemo {
    public static void main(String args[]){
        ChickShed chickShed=ChickShed.getInstance();
        for(int i=0; i<20; ++i){
            chickShed.addAnimal(new Chicken());
            System.out.println("a chicken has been Created");
        }

        Iterator iterator=chickShed.getIterator();
        while (iterator.hasNext()){
            Chicken chicken=(Chicken)iterator.next();
            if(chicken!=null) {
                System.out.println(chicken.getName() + " has been covered by iterator");
            }
        }
    }
}
