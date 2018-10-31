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
    private String LightState="off";
    public Memento(String LightState){
        this.LightState=LightState;
    }
    public String getLightState() {
        return LightState;
    }
}
