package designPatterns.observer.messageBoard;


import designPatterns.observer.messageBoard.MessageBoard;
import designPatterns.observer.utils.Employee;
import designPatterns.observer.utils.EmployeeSkill;
import designPatterns.observer.utils.Farmer;

import java.util.Observable;
import java.util.Observer;

public class Test {
   static public void main() {
       MessageBoard messageBoard = MessageBoard.getInstance();
       Farmer farmer = Farmer.getInstance();
       Employee employee = new Employee("", EmployeeSkill.cultivation, 0);

       messageBoard.addObserver(employee);
       messageBoard.addObserver(farmer);
       messageBoard.notifyObservers();
   }
}