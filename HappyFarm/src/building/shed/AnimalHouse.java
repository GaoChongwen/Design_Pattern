package building.shed;

import base.Building;
import base.animal.Animal;

import java.util.Iterator;

public class AnimalHouse extends Building {
    //protected int maxCapacity;
    protected int capacity;  //最大容量
    //protected int count;  //当前舍内动物数量
    protected int cost;  //造价
    //protected int lstPos;
    class AnimalIterator implements Iterator {
        private int curPos=0;
        @Override
        public boolean hasNext() {
            if(curPos<capacity)
                return true;
            else {
                curPos=0;
                return false;
            }
        }

        @Override
        public Object next() {
            Animal animal=animals[curPos];
            curPos++;
            return animals;
        }

        @Override
        public void remove() {
            if(capacity>0) {
                animals[curPos] = null;
            }
        }
    }
    //protected int level;
    Animal[] animals;

    public AnimalHouse(){
        capacity=0;
        //count=0;
        cost=0;
    }

    public boolean addAnimal(Animal animal){
        for(int i=0; i<capacity; ++i){
            if(animals[i]==null){
                animals[i]=animal;  //找到空栏位
                return true;
            }
        }
        return false;  //没有空栏位
    }

    public AnimalIterator getIterator(){
        return new AnimalIterator();
    }

}

