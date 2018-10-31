package building.house.memento;
import java.util.ArrayList;
import java.util.List;

/**
 * @project: memento
 * @description: CareTaker 存储Memento到mementoList
 * @designPatter: Memento
 * @author: Chen Zhi
 * @create: 2018-10-28
 **/

public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();
    public int length(){
        return  mementoList.size();
    }
    public void add(Memento LightState){
        mementoList.add(LightState);
    }
    public Memento get(int index){
        return mementoList.get(index);
    }
}
