package building.house.NullObject;

/**
 * @project: NullObject
 * @description: RealCommand
 * @designPatter: NullObjectPattern
 * @author: Chen Zhi
 * @create: 2018-10-28
 **/
public class RealCommand extends AbstractCommand{
    public RealCommand(String name){
        this.name=name;
    }
    @Override
    public  String getName(){
        return name;
    }
    @Override
    public boolean isNil(){
        return  false;
    }
}
