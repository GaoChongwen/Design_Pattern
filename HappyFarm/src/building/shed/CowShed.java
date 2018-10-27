package building.shed;

public class CowShed extends Shed {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CowShed(String name) {
        this.name = name;
    }

    @Override
    public void bulidShed() {
        System.out.println("正在为奶牛搭建牛棚...");
    }

    @Override
    public void done() {
        System.out.println("一个简易的牛棚搭建完成。\n");
    }
}
