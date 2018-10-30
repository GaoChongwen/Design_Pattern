package propComp.PropDir;

public class Root {
    private static Root root = new Root();
    public Node propDir = new Node("Item");
    private Root(){}

    //获取唯一可用的对象
    public static Root getInstance(){
        return root;
    }

}
