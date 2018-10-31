package test.memento;

import building.house.House;
import building.house.memento.CareTaker;
import building.house.memento.Originator;
import building.house.memento.Redo;
import building.house.memento.Undo;


/**
 * @project: memento
 * @description: MementoPattern测试
 * @designPatter: Memento
 * @author: Chen Zhi
 * @create: 2018-10-28
 **/

public class MementoPatternDemo {
    public static void main(String[] args) {
     System.out.println("==========MementoPatternDemo========");
     System.out.println("Scene: In the house ,you can turn off/on the light,then you can revert the action ues redo/undo ");
     System.out.println("===================================================");
        int index=-1;
      Originator originator=new Originator();
       CareTaker careTaker=new CareTaker();
       System.out.println("The current lights are "+House.getInstance().getLightState());
       System.out.println("MementoPattern:originator:setLightState:Save lightState to originator");
       originator.setLightState(House.getInstance().getLightState());
       index++;
        //originator.setHouse(hou1);
        //originator.setHouse(house2);
        System.out.println("MementoPattern:careTaker:add:add originator'lightState to careTaker, careTaker[0] is "+originator.getLightState());
        careTaker.add(originator.saveLightStateToMemento());
        System.out.println("setLightState on");
        House.getInstance().setLightState("on");
        index++;
        System.out.println("The current lights are "+House.getInstance().getLightState());
        System.out.println("MementoPattern:originator:setLightState:Save lightState to originator");
        originator.setLightState(House.getInstance().getLightState());
        System.out.println("MementoPattern:careTaker:add:add originator'lightState to careTaker, careTaker[1] is "+originator.getLightState());
        careTaker.add(originator.saveLightStateToMemento());
        System.out.println("setLightState off");
        House.getInstance().setLightState("off");
        index++;
        System.out.println("The current lights are "+House.getInstance().getLightState());
        System.out.println("MementoPattern:originator:setLightState:Save lightState to originator");
        originator.setLightState(House.getInstance().getLightState());
        System.out.println("MementoPattern:careTaker:add:add originator'lightState to careTaker, careTaker[2] is "+originator.getLightState());
        careTaker.add(originator.saveLightStateToMemento());
        System.out.println("setLightState on");
        House.getInstance().setLightState("on");
        index++;
        System.out.println("The current lights are "+House.getInstance().getLightState());
        System.out.println("MementoPattern:originator:setLightState:Save lightState to originator");
        originator.setLightState(House.getInstance().getLightState());
        System.out.println("MementoPattern:careTaker:add:add originator'lightState to careTaker, careTaker[3] is "+originator.getLightState());
        careTaker.add(originator.saveLightStateToMemento());
        //originator.setHouse(house3);
        //careTaker.add(originator.saveHouseToMemento());
        //originator.setHouse(house4);
        //careTaker.add(originator.saveHouseToMemento());
        //System.out.println("Current State: " + originator.getHouse());
        //originator.getHouseFromMemento(careTaker.get(0));
        //System.out.println("First saved State: " + originator.getHouse());
        //originator.getHouseFromMemento(careTaker.get(1));
        //System.out.println("Second saved State: " + originator.getHouse());
        Redo redo=new Redo();
        Undo undo=new Undo();
        System.out.println(" .we are in careTaker["+index+"] ");

        redo.Redo(careTaker,index);
        if(index<careTaker.length()-1)
          index++;

        System.out.println(" .we are in careTaker["+index+"] ");
        undo.Undo(careTaker,index);
        if(index>0)
           index--;

        System.out.println(" .we are in careTaker["+index+"] ");

        redo.Redo(careTaker,index);
        if(index<careTaker.length()-1)
            index++;

     System.out.println(" .we are in careTaker["+index+"] ");

     undo.Undo(careTaker,index);
     if(index>0)
      index--;

     System.out.println(" .we are in careTaker["+index+"] ");

     undo.Undo(careTaker,index);
     if(index>0)
      index--;

     System.out.println(" .we are in careTaker["+index+"] ");
     undo.Undo(careTaker,index);
     if(index>0)
      index--;
     System.out.println(" .we are in careTaker["+index+"] ");
     undo.Undo(careTaker,index);
     if(index>0)
      index--;
     System.out.println(" .we are in careTaker["+index+"] ");




    }
}
