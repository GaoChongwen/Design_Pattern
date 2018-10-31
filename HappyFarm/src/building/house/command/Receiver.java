package building.house.command;
//这里的Receiver就是house，这些操作也应该写在House上，也可以说是实际执行者

/**
 * @project: command
 * @description: 实际执行者
 * @designPatter: Command
 * @author: Chen Zhi
 * @create: 2018-10-28
 **/
public class Receiver {
    public void  SetFurniture()
    {
        System.out.println("Set Furniture success!");
    }
    public void  RmFurniture()
    {
        System.out.println("Remove Furniture success!");
    }
    public void NoCommand(){
        System.out.println("this is a NoCommand!");
    }
}
