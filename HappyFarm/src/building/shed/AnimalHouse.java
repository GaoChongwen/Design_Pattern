package building.shed;

import base.ClockObserver;
import base.FarmObj;
import base.Iterator;
import base.animal.Animal;
import building.ImpVisitor.BuildingAcceptor;
import building.ImpVisitor.BuildingVisitor;

import java.util.Observable;
import java.util.Observer;

public class AnimalHouse extends ClockObserver implements BuildingAcceptor {
    //protected int maxCapacity;
    protected int capacity;  //最大容量
    //protected int count;  //当前舍内动物数量
    protected int cost;  //造价

    @Override
    public void update(Observable o, Object arg) {
        for(int i=0; i<capacity; ++i){
            animals[i].grow();
        }
        for (int i=0; i<capacity; ++i){
            if(animals[i].shouldRemove)
                animals[i]=null;
        }
    }


    //protected int lstPos;
    class AnimalIterator implements Iterator {
        private int curPos = 0;

        @Override
        public boolean hasNext() {
            if (curPos < capacity)
                return true;
            else {
                curPos = 0;
                return false;
            }
        }

        @Override
        public Object next() {
            Animal animal = animals[curPos];
            curPos++;
            return animals;
        }
    }

    //protected int level;
    Animal[] animals;

    public AnimalHouse() {
        capacity = 0;
        //count=0;
        cost = 0;
    }

    public boolean addAnimal(Animal animal) {
        for (int i = 0; i < capacity; ++i) {
            if (animals[i] == null) {
                animals[i] = animal;  //找到空栏位
                return true;
            }
        }
        return false;  //没有空栏位
    }

    public AnimalIterator getIterator() {
        return new AnimalIterator();
    }

    // 获取动物窝的名字
    public String getName() {
        return null;
    }

    // 搭建动物窝
    public void bulidShed() {
        System.out.println("开始搭建动物的住所...");
    }

    // 动物窝搭建完成
    public void done() {
        System.out.println("一个简陋的动物屋搭建完成。");
    }

    // 作为Visitor模式中的接受者, 接收访问者
    @Override
    public void accept(BuildingVisitor buildingVisitor) {
        buildingVisitor.visit(this);
    }

}

