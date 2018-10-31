package building.shed;

import base.FarmObj;
import base.Iterator;
import base.animal.Animal;
import building.ImpVisitor.BuildingAcceptor;
import building.ImpVisitor.BuildingVisitor;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class AnimalHouse extends FarmObj implements BuildingAcceptor, Observer {
    //protected int maxCapacity;
    protected int capacity;  //最大容量
    //protected int count;  //当前舍内动物数量
    protected int cost;  //造价
    //protected int level;
    Animal[] animals;

    public AnimalHouse() {
        capacity = 0;
        //count=0;
        cost = 0;
    }

    @Override
    public void update(Observable o, Object arg) {
        _clear();
        for(int i=0; i<capacity; ++i){
            if(animals[i]!=null) {
                animals[i].grow();
            }
        }
        _clear();
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
            return animal;
        }

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

    public ArrayList<Animal> slaughter(){
        _clear();
        ArrayList<Animal> ret=new ArrayList<Animal>();
        for(int i=0; i<capacity; ++i){
            if(animals[i]!=null&&animals[i].isMature){
                animals[i].shouldRemove=true;
                ret.add(animals[i]);
                System.out.println(animals[i].getName()+" has been killed");
                //System.out.println("您是想卖掉这只"+animals[i].getName()+"还是想加工它呢？");
            }
        }
        _clear();
        return ret;
    }

    public void feed(){
        _clear();
        for(int i=0; i<capacity; ++i){
            if(animals[i]!=null){
                animals[i].eat();
            }
        }
        _clear();
    }

    private void _clear(){
        for(int i=0; i<capacity; ++i){
            if(animals[i]!=null&&animals[i].shouldRemove){
                animals[i]=null;
            }
        }
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
        System.out.println("Building shed...");
    }

    // 动物窝搭建完成
    public void done() {
        System.out.println("Done.");
    }

    // 作为Visitor模式中的接受者, 接收访问者
    @Override
    public void accept(BuildingVisitor buildingVisitor) {
        buildingVisitor.visit(this);
    }

}

