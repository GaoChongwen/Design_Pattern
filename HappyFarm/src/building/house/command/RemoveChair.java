package building.house.command;

import building.house.House;
import building.house.furniture.Chair;

/**
 * @project: command
 * @description: 具体命令类，删除椅子命令
 * @designPatter: Command
 * @author: Chen Zhi
 * @create: 2018-10-28
 **/

public class RemoveChair implements ICommand{

    public RemoveChair(House house)
    {

    }
    public void Execute()
    {
        Chair chair=new Chair();
        House.getInstance().removeFuniture(chair);
    }
    public boolean isNil(){
        return false;
    }
}
