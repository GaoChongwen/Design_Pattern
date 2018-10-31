package building.house.NullObject;

/**
 * @project: NullObject
 * @description: 抽象命令，RealCommand与NullCommand基类
 * @designPatter: NullObjectPattern
 * @author: Chen Zhi
 * @create: 2018-10-28
 **/
public abstract class AbstractCommand {
    protected String name;
    public abstract boolean isNil();
    public abstract String getName();
}
