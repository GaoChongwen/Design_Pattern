package building.house.NullObject;

import building.house.House;
/**
 * @project: NullObject
 * @description: NullCommand
 * @designPatter: NullObjectPattern
 * @author: Chen Zhi
 * @create: 2018-10-28
 **/

public class NullCommand extends AbstractCommand{

    @Override
    public String getName(){
        return "Not Available Command in Command list";
    }
    @Override
    public boolean isNil(){
        return true;
    }
}
