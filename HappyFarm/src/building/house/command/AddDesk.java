package building.house.command;

import building.house.House;
import building.house.furniture.Desk;


/**
 * @project: command
 * @description: 具体命令类，添加Desk命令
 * @designPatter: Command
 * @author: Chen Zhi
 * @create: 2018-10-28
 **/
public class AddDesk implements ICommand{
    private House house=null;
    public AddDesk(House house)
    {
        this.house=house;
    }
    public void Execute()
    {
        Desk desk=new Desk();
        House.getInstance().addFurniture(desk);
    }
    public boolean isNil(){
        return false;
    }
}
