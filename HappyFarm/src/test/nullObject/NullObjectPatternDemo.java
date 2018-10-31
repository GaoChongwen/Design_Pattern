package test.nullObject;

import building.house.NullObject.AbstractCommand;
import building.house.NullObject.CommandFactory;

/**
 * @project: NullObject
 * @description: NullObjectPattern 测试
 * @designPatter: NullObjectPattern
 * @author: Chen Zhi
 * @create: 2018-10-28
 **/
public class NullObjectPatternDemo {
    public static  void main (String[] args){
        System.out.println("==========NullObjectPatternDemo========");
        System.out.println("Scene: you can input the command,it will check whether it's in the command list");
        System.out.println("===================================================");
        AbstractCommand command1= CommandFactory.getCommand("AddChair");
        AbstractCommand command2=CommandFactory.getCommand("RemoveChair");
        AbstractCommand command3=CommandFactory.getCommand("AddTable");
        AbstractCommand command4=CommandFactory.getCommand("RemoveTable");
        AbstractCommand command5=CommandFactory.getCommand("AddDesk");
        AbstractCommand command6=CommandFactory.getCommand("RemoveDesk");

        System.out.println("NullObject:CommandFactory:getCommand:"+"get AddChair Command from Command List");
        System.out.println("NullObject:Command:getName:"+command1.getName());
        System.out.println("NullObject:CommandFactory:getCommand:"+"get RemoveChair Command from Command List");
        System.out.println("NullObject:Command:getName:"+command2.getName());
        System.out.println("NullObject:CommandFactory:getCommand:"+"get AddTable Command from Command List");
        System.out.println("NullObject:Command:getName:"+command3.getName());
        System.out.println("NullObject:CommandFactory:getCommand:"+"get RemoveTable Command from Command List");
        System.out.println("NullObject:Command:getName:"+command4.getName());
        System.out.println("NullObject:CommandFactory:getCommand:"+"get AddDesk Command from Command List");
        System.out.println("NullObject:Command:getName:"+command5.getName());
        System.out.println("NullObject:CommandFactory:getCommand:"+"get RemoveDesk Command from Command List");
        System.out.println("NullObject:Command:getName:"+command6.getName());
        System.out.println("***********************");


    }
}
