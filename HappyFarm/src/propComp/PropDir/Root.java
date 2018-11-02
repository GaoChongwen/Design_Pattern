package propComp.PropDir;

import utils.clock.Clock;

import java.util.Observable;
import java.util.Observer;

/**
 * @Design-Pattern: Singleton Pattern
 * @description: 生成实例 方便使用工具箱
 * @version 2018/11/01
 * @author Pengcheng He
 *
 */
public class Root implements Observer{
    private static Root root = new Root();
    private static boolean initialized = false;
    public Node propDir = new Node("Item");
    private Root(){}

    //获取唯一可用的对象
    public static Root getInstance(){
        return root;
    }

    @Override
    public void update(Observable o, Object arg) {
        Prop.CheckAndRemove(propDir);
    }

    public static boolean isInitialized(){
        return initialized;
    }

    public static void initialize(){
        initialized = true;
    }
}
