package utils.test;

import base.Person;
import person.Employee;
import utils.EmployeeSkill;

/**
 * Mediator: 中介者模式
 * 场景：cyl 和 ppp 通过留言板发消息
 */
public class Mediator {
    public static void main(String args[]){
        Employee cyl = new Employee("cyl", new EmployeeSkill[]{EmployeeSkill.cultivation}, 5000);
        Employee ppp = new Employee("ppp", new EmployeeSkill[]{EmployeeSkill.breeding}, 5000);

        cyl.leaveMessage("Hi pp~");
        ppp.leaveMessage("Hi ll~");
    }

}
