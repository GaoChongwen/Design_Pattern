package building.house.memento;

import building.house.House;


/**
 * @project: memento
 * @description: 操作Memento的Object
 * @designPatter: Memento
 * @author: Chen Zhi
 * @create: 2018-10-28
 **/

public class Originator {
    private String HouseName;
    public void setHouseName(String HouseName){
        this.HouseName=HouseName;
    }
    public String getHouseName(){
        return HouseName;
    }
    public Memento saveHouseNameToMemento(){
        return new Memento(HouseName);
    }

}
