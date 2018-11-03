package building.house.memento;

import building.house.House;


/**
 * @project: memento
 * @description: 撤销上一命令
 * @designPatter: Memento
 * @author: Chen Zhi
 * @create: 2018-10-28
 **/

public class Undo {
    public void Undo(CareTaker careTaker,int index){
        if(index>0&&index<careTaker.length()){
            House.getInstance().setHouseName(careTaker.get(--index).getHouseName());
            System.out.print("MementoPattern:Uedo:Uedo:we are in careTaker["+index+"].The current HouseName are \""+ House.getInstance().getHouseName()+"\"");  }
        else{
            System.out.println("MementoPattern:Uedo:Uedo:MementoPattern:Uedo:undo fail,you can do redo operation because index is equal to 0");
            System.out.print("we are in careTaker["+index+"].The current HouseName are "+ House.getInstance().getHouseName());
        }
    }
}
