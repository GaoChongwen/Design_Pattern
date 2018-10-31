package propComp.PropDir;

/**
 * @Design-Pattern: Singleton Pattern
 * @description: 生成实例 方便使用工具箱
 * @version 2018/10/30
 * @author jihao luo
 *
 */
public class Root {
    private static Root root = new Root();
    public Node propDir = new Node("Item");
    private Root(){}

    //获取唯一可用的对象
    public static Root getInstance(){
        return root;
    }

}
