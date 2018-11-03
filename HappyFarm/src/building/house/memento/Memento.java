package building.house.memento;

import building.house.House;

/**
 * @project: memento
 * @description: 存储信息的Object
 * @designPatter: Memento
 * @author: Chen Zhi
 * @create: 2018-10-28
 **/
public class Memento {
    private String HouseName="your house";
    public Memento(String HouseName){
        this.HouseName=HouseName;
    }
    public String getHouseName() {
        return HouseName;
    }
}
