package building.house.command;

import building.house.House;
import building.house.furniture.Chair;
/**
 * @project: command
 * @description: 具体命令类，添加椅子命令
 * @designPatter: Command
 * @author: Chen Zhi
 * @create: 2018-10-28
 **/

public class AddChair implements ICommand{
    public AddChair(House house)
    {
    }
    public void Execute()
    {
        Chair chair=new Chair();
        House.getInstance().addFurniture(chair);
    }
    public boolean isNil(){
        return false;
    }
}
