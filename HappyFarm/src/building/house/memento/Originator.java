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
    private String LightState;
    public void setLightState(String LightState){
        this.LightState=LightState;
    }
    public String getLightState(){
        return LightState;
    }
    public Memento saveLightStateToMemento(){
        return new Memento(LightState);
    }
    public void getHouseFromMemento(Memento memento){
        LightState=memento.getLightState();
    }
}
