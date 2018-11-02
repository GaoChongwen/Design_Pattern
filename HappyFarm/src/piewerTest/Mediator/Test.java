package piewerTest.Mediator;

import base.Person;
import person.Employee;
import person.Farmer;
import singleton.Farm;
import singleton.MessageBoard;
import utils.Enum.DesignPatternMode;
import utils.Enum.EmployeeSkill;

public class Test {
    static public void main(String args[]){
        // 设置Mediator模式
        MessageBoard.setDesignPatternMode(DesignPatternMode.MediatorPattern);

        Employee emp1 = new Employee("emp1",EmployeeSkill.cultivation, 100);
        Employee emp2 = new Employee("emp1", EmployeeSkill.breeding, 200);
        Farmer farmer = Farmer.getInstance();

        farmer.leaveMessage("hello");
        emp1.leaveMessage("happy");
        emp2.leaveMessage("farm");


    }
}
