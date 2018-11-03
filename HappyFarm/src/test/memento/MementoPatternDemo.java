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
  int index=-1;
  Originator originator=new Originator();
  CareTaker careTaker=new CareTaker();
  System.out.println("The current HouseName are \""+ House.getInstance().getHouseName()+"\"");
  System.out.println("MementoPattern:originator:setHouseName:Save HouseName to originator");
  originator.setHouseName(House.getInstance().getHouseName());
  index++;
  //originator.setHouse(hou1);
  //originator.setHouse(house2);
  System.out.println("MementoPattern:careTaker:add:add originator'HouseName to careTaker, careTaker[0] is "+originator.getHouseName());
  careTaker.add(originator.saveHouseNameToMemento());
  System.out.println("setHouseName");
  House.getInstance().setHouseName();
  index++;
  System.out.println("The current HouseName are \""+ House.getInstance().getHouseName()+"\"");
  System.out.println("MementoPattern:originator:setHouseName:Save HouseName to originator");
  originator.setHouseName(House.getInstance().getHouseName());
  System.out.println("MementoPattern:careTaker:add:add originator'HouseName to careTaker, careTaker[1] is "+originator.getHouseName());
  careTaker.add(originator.saveHouseNameToMemento());
  System.out.println("setHouseName");
  House.getInstance().setHouseName();
  index++;
  System.out.println("The current HouseName are \""+ House.getInstance().getHouseName()+"\"");
  System.out.println("MementoPattern:originator:setHouseName:Save HouseName to originator");
  originator.setHouseName(House.getInstance().getHouseName());
  System.out.println("MementoPattern:careTaker:add:add originator'HouseName to careTaker, careTaker[2] is "+originator.getHouseName());
  careTaker.add(originator.saveHouseNameToMemento());
  System.out.println("setHouseName");
  House.getInstance().setHouseName();
  index++;
  System.out.println("The current HouseName are \""+ House.getInstance().getHouseName()+"\"");
  System.out.println("MementoPattern:originator:setLightState:Save HouseName to originator");
  originator.setHouseName(House.getInstance().getHouseName());
  System.out.println("MementoPattern:careTaker:add:add originator'HouseName to careTaker, careTaker[3] is "+originator.getHouseName());
  careTaker.add(originator.saveHouseNameToMemento());
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
