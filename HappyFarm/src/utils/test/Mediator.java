package utils.test;

import base.Person;
import person.Employee;
import utils.EmployeeSkill;
import utils.MessageBoard;

/**
 * Mediator: 中介者模式
 * 场景：cyl 和 ppp 通过留言板发消息
 */
public class Mediator {
    public static void main(String args[]){
        Employee cyl = new Employee("cyl", EmployeeSkill.cultivation, 5000);
        Employee ppp = new Employee("ppp", EmployeeSkill.breeding, 5000);

        cyl.leaveMessage("Hi pp~");
        ppp.leaveMessage("Hi ll~");

        MessageBoard.showMessages();
    }

}
