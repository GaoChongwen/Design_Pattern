package building.shed;

import base.FarmObj;
import base.Iterator;
import base.animal.Animal;
import building.ImpVisitor.BuildingAcceptor;
import building.ImpVisitor.BuildingVisitor;
import utils.Enum.DesignPatternMode;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class AnimalHouse extends FarmObj implements BuildingAcceptor, Observer {
    //protected int maxCapacity;
    protected int capacity;  //最大容量
    //protected int count;  //当前舍内动物数量
    protected int cost;  //造价
    //protected int level;
    Animal[] animals;  //存储animal数组
    private String animalName;

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    protected static DesignPatternMode DesignPattern;


    public AnimalHouse() {
        capacity = 0;
        //count=0;
        cost = 0;
        DesignPattern=null;
    }

    public void count(){
        _clear();
        int bcnt=0;
        int gcnt=0;
        int mcnt=0;
        int dcnt=0;
        for(int i=0; i<capacity; ++i){
            if(animals[i]!=null){
                if(animals[i].getState().getStateNanem().equals("babyState")){
                    bcnt++;
                }
                else if(animals[i].getState().getStateNanem().equals("growingState")){
                    gcnt++;
                }
                else if(animals[i].getState().getStateNanem().equals("matureState")){
                    mcnt++;
                }
                else if(animals[i].getState().getStateNanem().equals("deadState")){
                    dcnt++;
                }
            }
        }
        System.out.println("in this "+this.getName()+"there are");
        System.out.println("there are "+bcnt+" baby "+this.getAnimalName());
        System.out.println("there are "+gcnt+" growing "+this.getAnimalName());
        System.out.println("there are "+mcnt+" mature "+this.getAnimalName());
    }

    @Override
    public void update(Observable o, Object arg) {  //animalhouse作为观察者，观察clock
        if(DesignPattern==DesignPatternMode.ObserverPattern){
            System.out.println("Observer Pattern | "+getName()+" method: update(Observable o, Object arg) -> to grow FarmObj in "+getName());
        }
        _clear(); //清理掉死掉的动物
        for(int i=0; i<capacity; ++i){
            if(animals[i]!=null) {
                animals[i].grow();
            }
        }
        _clear();  //清理掉死掉的动物
    }

    //protected int lstPos;
    class AnimalIterator implements Iterator {  //迭代器，可以遍历而不必关心容器的具体类型
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

    public AnimalIterator getIterator() {
        return new AnimalIterator();
    }

    public boolean addAnimal(Animal animal) {  //添加动物
        for (int i = 0; i < capacity; ++i) {
            if (animals[i] == null) {
                animals[i] = animal;  //找到空栏位
                return true;
            }
        }
        return false;  //没有空栏位
    }

    public ArrayList<Animal> slaughter(){  //屠宰已经成熟的动物，返回一个被屠宰的动物的array
        _clear();  //清理掉死动物
        ArrayList<Animal> ret=new ArrayList<Animal>();
        for(int i=0; i<capacity; ++i){
            if(animals[i]!=null&&animals[i].isMature){
                animals[i].shouldRemove=true;
                ret.add(animals[i]);
                System.out.println(animals[i].getName()+" has been killed");
            }
        }
        _clear();  //清理掉死动物
        return ret;
    }

    public void feed(){  //喂养畜舍内所有的动物
        _clear();//先清理死掉的动物
        for(int i=0; i<capacity; ++i){
            if(animals[i]!=null){
                animals[i].eat();
            }
        }
        _clear();
    }

    private void _clear(){  //清理死掉的动物
        for(int i=0; i<capacity; ++i){
            if(animals[i]!=null&&animals[i].shouldRemove){
                animals[i]=null;
            }
        }
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

    public static void setDesignPattern(DesignPatternMode designPatter){
        DesignPattern=designPatter;
    }

}

