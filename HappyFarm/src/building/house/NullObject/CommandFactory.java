package building.house.NullObject;

import building.house.House;

/**
 * @project: NullObject
 * @description: 存储CommandList的地方，而且可以获取命令，辨明命令类别
 * @designPatter: NullObjectPattern
 * @author: Chen Zhi
 * @create: 2018-10-28
 **/

public class CommandFactory {

    public static final String[] command={ "AddChair" , "AddDesk","RemoveChair","RemoveDesk"};

    public static AbstractCommand getCommand(String name){

        for(int i=0;i<command.length;i++){
            if(command[i].equalsIgnoreCase((name))){
                return  new RealCommand(name);
            }
        }
        return new NullCommand();
    }
}
